package profgrouping; 

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Comparable<Student>, Serializable { //Students are compared based on score.
	
    private static final long serialVersionUID = 1L;
    private String studentID;
    private double score;
    private String firstName;
    private String lastName;
    private ArrayList<Student> forbiddenPartners; 
    private ArrayList<Student> mandatoryPartners;

    public Student() {
            studentID = "";
            score = 0;
            this.firstName = "";
            this.lastName = "";
            forbiddenPartners = new ArrayList<Student>();
            mandatoryPartners = new ArrayList<Student>();
            
    }
    public Student(String firstName, String lastName, String id, double score){
            this.setStudentID(id);
            this.setScore(score);
            this.firstName = firstName;
            this.lastName = lastName;
            forbiddenPartners = new ArrayList<Student>();
            mandatoryPartners = new ArrayList<Student>();
    }

    public int compareTo(Student otherStudent) {
            if (score < otherStudent.score) return -1; 
            if (score > otherStudent.score) return 1;
            return 0; 
    }

    public boolean equals(Student otherStudent) {
            return studentID.equals(otherStudent.studentID); 
    }

    public ArrayList<Student> getForbiddenPartners() {
            return forbiddenPartners;
    }

    public ArrayList<Student> getMandatoryPartners() {
            return mandatoryPartners;
    }

    public void setForbiddenPartners(ArrayList<Student> forbidPartners) {
            this.forbiddenPartners = forbidPartners;
    }

    public void setMandatoryPartners(ArrayList<Student> mandatPartners) {
            this.mandatoryPartners = mandatPartners;
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
             return getFirstName() + getLastName()+ " (ID: " + getStudentID() + ") | GPA: " + getScore(); 		 
     }
//     @SuppressWarnings("unused")
//    private boolean mandatoryPartner(Student s){
//             for (Student student : mandatoryPartners){
//                     if (student == s){
//                             return true;
//                     }
//             }
//         return false;
//     }
//
//     @SuppressWarnings("unused")
//    private boolean isForbiddenPartner(Student s){
//             for (Student student : forbiddenPartners){
//                     if (student == s){
//                             return true;
//                     }
//             }
//         return false;
//     }

    public void addForbiddenPartner(Student otherStudent) {
        if (!forbiddenPartners.contains(otherStudent)) {
            forbiddenPartners.add(otherStudent); 
        }
        
    }
    
    public void addMandatoryPartner(Student otherStudent) {
        if (!mandatoryPartners.contains(otherStudent)) {
            mandatoryPartners.add(otherStudent); 
        }
    }
}

