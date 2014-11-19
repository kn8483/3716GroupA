public class Student {
	private String studentID;
	private double score;
	private String firstName;
	private String lastName;
	
	public Student(){
		studentID="";
		score = 0;
		this.firstName = "";
		this.lastName = "";
	}
	
	public Student(String firstName, String lastName, String id, double score){
		this.setStudentID(id);
		this.setScore(score);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public double getScore() {
		return score;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}
	 public String toString(){
		 return "Student: "+ getFirstName()+" "+ getLastName()+"\n"+"Studnt ID: "+getStudentID()+"\n"+"Score: "+getScore()+"\n"+"---"; 		 
	 }
	

}
