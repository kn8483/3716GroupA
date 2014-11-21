package profgrouping;

import java.util.ArrayList;
import java.io.Serializable;

public class Group implements Serializable {

	private int spaces; 
	private ArrayList<Student> members;
	private ArrayList<Student> unaddableMembers;
	
	public Group(int groupSize) {
		spaces = groupSize;
		members = new ArrayList<Student>();
		unaddableMembers = new ArrayList<Student>(); 
	}
	
	public boolean isFull() {
		return (spaces <= 0); 
	}
	
	public int getSpaces() {
		return spaces;
	}
	
	public ArrayList<Student> getMembers() {
		return members;
	}
	
	public ArrayList<Student> getUnaddableMembers() {
		return unaddableMembers;
	}
	
	public void add(ArrayList<Student> studentList, ArrayList<Student> classList) {
		
		//Need to pass reference to classList so that each student that is added 
		//to a group can be removed from the classList. 
		
		if (spaces < studentList.size()) throw new InsufficientRoomException(); 
		
		for (Student s : studentList) {
			for (Student u : unaddableMembers) {
				if (s.equals(u)) throw new ForbiddenPartnerException(); 
			}
		}
				
		for (Student s : studentList) {
			members.add(s); 
			spaces--;
			for (Student f : s.getForbiddenPartners()) {
				unaddableMembers.add(f); 
			}
			int index = classList.indexOf(s);
			classList.remove(index); 
		}
	}

	public void add(Student singleStudent, ArrayList<Student> classList) { //Overload method to conveniently make calls for adding one student to a group.
		ArrayList<Student> listOfOne = new ArrayList<Student>();
		listOfOne.add(singleStudent);
		add(listOfOne, classList); 
	}
        
        public String toString() {
            String toReturn = ""; 
            for (Student s : members) {
                toReturn += s.getName() + "\n"; 
            }
            toReturn += "\n"; 
            return toReturn; 
        }
}