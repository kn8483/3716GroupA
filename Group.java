import java.util.ArrayList;

public class Group {
	private ArrayList<Student> studentsList;
	private int size;
	private int groupNumber;
	
	public Group(int size, int number){
		this.size = size;
		groupNumber = number;
		this.studentsList = new ArrayList<Student>();
	}
	public Group(int size){
		this.size = size;
		this.studentsList = new ArrayList<Student>();
	}
	
	public Group(){		
		this.studentsList = new ArrayList<Student>();
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setGroupList(ArrayList<Student> groupList) {
		this.studentsList = groupList;
	}
	public ArrayList<Student> getGroupList() {
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
	
	public String toString(){
		String stringToReturn = "Group#: "+getGroupNumber()+"\n";
		for (Student s : studentsList){
			stringToReturn = stringToReturn+s.toString()+"\n";
		}
		return stringToReturn+"-----------------"+"\n";
	}
	
}
