package profgrouping;

import java.io.Serializable;
import java.util.ArrayList; 

public class Group implements Serializable {

	private int size; 
	private ArrayList<Student> studentsList;
	private ArrayList<Student> unaddableMembers;
	private int groupNumber;

	
	public Group(int size, int number){
            this.size = size;
            groupNumber = number;
            this.studentsList = new ArrayList<Student>();
            unaddableMembers = new ArrayList<Student>();
	}
	
	public Group(int size){
            this.size = size;
            this.studentsList = new ArrayList<Student>();
            unaddableMembers = new ArrayList<Student>();
	}
	
	public Group(){		
            this.studentsList = new ArrayList<Student>();
            unaddableMembers = new ArrayList<Student>();
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}	
	public ArrayList<Student> getUnaddableMembers() {
		return unaddableMembers;
	}
	 
	public void setUnaddableMembers(ArrayList<Student> unaddMemb) {
		this.unaddableMembers = unaddMemb ;
	}
        
        public void setGroupList(ArrayList<Student> groupList) {
		this.studentsList = groupList;
	}
	public ArrayList<Student> getStudentList() {
		return studentsList;
	}
	public void addStudent(Student s){
		if (studentsList.size() >= size){
			System.out.println("Group is Full");
		}
		else{
			studentsList.add(s);
		}
	}
        
        //Add student unconditionally (even if group is full)
        public void addStudentFinal(Student s) {
            studentsList.add(s);
        }
        
	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}
	public int getGroupNumber() {
		return groupNumber;
	}
	public boolean isFull(){		
	if (studentsList == null || studentsList.isEmpty()){
			return false;
		}
		return studentsList.size() >= size; 
	}
	public boolean isEmpty(){
		return studentsList.isEmpty();
	}
	
	public boolean hasForbiddenStudent(Student s){
		for (Student stud : unaddableMembers){
			if (stud == s){
				return true;
			}			
		}
	    return false; 
	}
	
	public static Group getEmptyGroup(ArrayList<Group> groupList){
		for (Group g : groupList){
			if (g.isEmpty()){
				return g; 
			}
		}
		return null;
	}
	
	public double groupAverage(){
		if (studentsList.size() == 0){
			return 0;
		}
		double totScore = 0;
		for (Student s : studentsList){
			totScore = totScore+s.getScore();
		}
		return totScore/studentsList.size();
	}
	public String toString(){
		String stringToReturn = "Group " + groupNumber + ": \n";
		for (Student s : studentsList){
			stringToReturn = stringToReturn+s.toString()+"\n";
		}
		return stringToReturn+"\n";
	}

    public void removeStudent(Student student) {
        for (int i = 0; i <= studentsList.size()-1; i++) {
            if (studentsList.get(i).equals(student)) {
                studentsList.remove(i); 
                break;
            }
        }
    }
}
