package profgrouping;

import java.io.Serializable;
import java.util.ArrayList; 

public class Student implements Serializable {
	
	private String name;
	private String studentNumber;
	private ArrayList<Student> forbiddenPartners; 
	private ArrayList<Student> mandatoryPartners;
	
	public Student(String name) {
		this.name = name;
		studentNumber = null; 
		forbiddenPartners = new ArrayList<Student>();
		mandatoryPartners = new ArrayList<Student>(); 
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Student> getForbiddenPartners() {
		return forbiddenPartners;
	}
	
	public ArrayList<Student> getMandatoryPartners() {
		return mandatoryPartners;
	}
	
	public boolean equals(Student otherStudent) {
		return studentNumber.equals(otherStudent.studentNumber); 
	}	
}