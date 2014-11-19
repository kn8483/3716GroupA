import java.util.ArrayList;
//import java.util.Iterator;

public class GroupsGenerator {
	private int groupSize;
	private ArrayList<Student> studentList;
	
public GroupsGenerator(int size, ArrayList<Student> students){
	this.groupSize = size;
	this.studentList = students;
}
	
	public void setSize(int size) {
		this.groupSize = size;
	}
	
	public int getSize() {
		return groupSize;
	}
	public void setStudentList(ArrayList<Student> a) {
		this.studentList = a;
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	
	public ArrayList<Group> makeGroups(){
		ArrayList<Group> groupsList = new ArrayList<Group>();
		int numOfGroups = 0;		
		int reducedGroups = getNumOfReducedGroups();
		if (reducedGroups > 0){
		    numOfGroups = (studentList.size() / groupSize) - reducedGroups + 1;
		}
		if (reducedGroups == 0){
			 numOfGroups = (studentList.size() / groupSize);
		}
					
		for (int i = 0; i < numOfGroups; i++){
			groupsList.add(new Group(groupSize));
		}
		if (reducedGroups > 0){ 
			for (int i = 0; i<reducedGroups; i++){
				groupsList.add(new Group(groupSize-1)); 
			}
		}
		
		StudentSorter studentSorter = new StudentSorter(studentList);
		studentSorter.sort();
		int listPartition = studentList.size()/groupSize;
		if (reducedGroups > 0){ 
			listPartition = listPartition + 1;
		}
		int studentEnumer = 0;
		for (Group g : groupsList){			
			int j = studentEnumer;
			g.setGroupNumber(j);
			while (! g.isFull() && j < studentList.size()){
				g.addStudent(studentList.get(j));
				j+= listPartition;
			}
			studentEnumer++;
		}
		return groupsList;
	}		
			
	public int getNumOfReducedGroups(){
		int studentListSize = studentList.size();
		int groupSizeRemainder = studentListSize % groupSize;
		if (groupSizeRemainder > 0){
			//double remainderToGroupSizeRatio = 1.0*groupSizeRemainder/groupSize;		
		    //if (remainderToGroupSizeRatio > 0.6){
			//    return 0;			
		    //}
		    //else{
		    	return groupSize - groupSizeRemainder;		
		   // }
		}
		System.out.println(groupSize - groupSizeRemainder);
		return 0;		
 }
}
