package profgrouping;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList; 

public class GroupMaker {

        private String courseName; 
	private int groupSize;
	private ArrayList<Student> classList; 
	private ArrayList<Group> groupList; 
	
	private MandatoryPartnerStrategy mps;
	private ForbiddenPartnerStrategy fps;
	private PartialGroupCompletionStrategy pgcs;
	private SkillBalancingStrategy sbs;
	private GroupMakingStrategy gms;
	
	public GroupMaker(String id, int groupSize, ArrayList<Student> classList) {
                this.courseName = id;
		this.groupSize = groupSize;
		this.classList = new ArrayList<Student>(); 
		for (Student s : classList) { //Make deep copy for working on.
			this.classList.add(s); 
		}
		groupList = new ArrayList<Group>();
		
		mps = new MPS1();
		fps = new FPS1();
		pgcs = new PGCS1();
		sbs = new SBS1();
		gms = new GMS1(); 	
                
                System.out.println("in groupmaker constructor done");
	}

	public void generateGroups() {
	
		mps.enforceGroups(groupList, classList);
		fps.preventGroups(groupList, classList);
		pgcs.completeGroups(groupList, classList);
		sbs.arrangeToBalanceSkills(classList); 
		gms.makeGroups(groupSize, groupList, classList); 
                
                System.out.println("in generate groups done");
                
                writeGroupsToFile();
                for (Group g : groupList) {
                    System.out.println(g); 
                }
                System.out.println("finished writing to file");

	}
        
	public void writeGroupsToFile() {
            String outputText = ""; 
            for (int i = 0; i < groupList.size(); i++) {
                int groupNumber = i + 1; 
                outputText += "Group " + groupNumber + ":" + "\n";
                outputText += groupList.get(i).toString();
                outputText += "\n"; 
            }
			
            try { 
                    File outputFile = new File(courseName + "_groupList.txt"); 
                    PrintWriter printer = new PrintWriter(outputFile);
                    outputText = outputText.replaceAll("\n", System.lineSeparator()); //necessary for new lines
                    printer.write(outputText); 
                    printer.close();
            }

            catch (FileNotFoundException e) {
                    System.out.print("Couldn't write to file."); 
            }			
    }
	
}