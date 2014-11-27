package profgrouping;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import profgrouping.strategies.implementations.GSS.*;
import profgrouping.strategies.implementations.FPS.*;
import profgrouping.strategies.implementations.MPS.*;
import profgrouping.strategies.implementations.PGCS.*;
import profgrouping.strategies.implementations.SBS.*;




/**
 *
 * @author Maria
 */
public class SessionController {
    
    private String courseName;
    private ArrayList<Student> classlist;
    private ArrayList<Group> groupList; 
    
    public SessionController(String courseName) {
        this.courseName = courseName; 
        classlist = returnStudentArrayListFromBinaryFile("classlist_" + this.courseName + ".bin");
    } 

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Group> getGroupList() {
        return groupList;
    }
    
    public ArrayList<Student> getClasslist() {
        return classlist;
    }

    public void setClasslist(ArrayList<Student> classlist) {
        this.classlist = classlist;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public static ArrayList<Student> returnStudentArrayListFromBinaryFile(String filename) {
        try { 
          FileInputStream fis = new FileInputStream(filename);
          ObjectInputStream ois = new ObjectInputStream(fis);
          ArrayList<Student> toReturn = (ArrayList<Student>) ois.readObject(); 
          ois.close();
          return toReturn;
        }

        catch(IOException ex){
                System.out.println(ex);
                return null;
        }

        catch(ClassNotFoundException ex){
                System.out.println(ex);
                return null; 
        }
    }

    public void forbid(Object[] objects) {
        Student[] students = new Student[objects.length];
        for (int i = 0; i < objects.length; i++) {
            Student student = (Student) objects[i];
            students[i] = student; 
        }
        forbid(students);
    }  
    
    public void forbid(Student[] students) {
        for (Student s : students) {
            for (Student otherStudent : students) {
                if (!s.equals(otherStudent)) {
                    s.addForbiddenPartner(otherStudent); 
                }
            }
        }
    }
    
        public void mandate(Object[] objects) {
        Student[] students = new Student[objects.length];
        for (int i = 0; i < objects.length; i++) {
            Student student = (Student) objects[i];
            students[i] = student; 
        }
        mandate(students);
    }  
    
    public void mandate(Student[] students) {
        for (Student s : students) {
            for (Student otherStudent : students) {
                if (!s.equals(otherStudent)) {
                    s.addMandatoryPartner(otherStudent); 
                }
            }
        }
    }

    public void useGroupMaker(int groupSize) {
        GroupMaker groupMaker = new GroupMaker(groupSize, classlist);
        groupMaker.generateGroups();
        groupList = groupMaker.getGroupList();     
    }
    
    public void save(String groupListText) {
        writeGroupArrayListToBinaryFile(groupList, courseName + "_Groups.bin");
        try { 
            PrintWriter writer = new PrintWriter(courseName + "_Groups.txt");
            writer.write(groupListText);
            writer.close();
        } 
        
        catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        
    }
    
    public static void writeGroupArrayListToBinaryFile(ArrayList<Group> arrayList, String filename) {
            try { 
              FileOutputStream fos = new FileOutputStream(filename);
              ObjectOutputStream oos = new ObjectOutputStream(fos);
              oos.writeObject(arrayList);		  
              oos.close();
            }

            catch(IOException ex){
                    System.out.println(ex);
            }
    }

    public void swap(Student student1, Student student2) {
        Group originalGroupOfStudent1 = null;
        Group originalGroupOfStudent2 = null; 
        for (Group g : groupList) {
            if (g.getStudentList().contains(student1)) {
                originalGroupOfStudent1 = g;
            }
            if (g.getStudentList().contains(student2)) {
                originalGroupOfStudent2 = g;
            }
        }
        originalGroupOfStudent1.removeStudent(student1);
        originalGroupOfStudent1.addStudentFinal(student2);
        originalGroupOfStudent2.removeStudent(student2);
        originalGroupOfStudent2.addStudentFinal(student1);
    }

    void moveStudentToGroup(Student student, Group newGroup) {
        Group originalGroup = null;
        for (Group g : groupList) {
            if (g.getStudentList().contains(student)) {
                originalGroup = g;
                break;
            }
        }
        originalGroup.removeStudent(student); 
        newGroup.addStudentFinal(student); 
    }

    public void useGroupMaker(int groupSize, boolean guaranteeGroupSize, boolean balanceSkill, boolean randomize, boolean sequential) {
        //GSS1 guarantees that the min group size is one less than the specified one, whereas
        //GSS2 just puts however many leftover students in the last group.
        
        //SBS2 balances skill among groups.
        //SBS4 does not balance skill, randomizes the classlist before assigning. 
        //SBS1 does not balance skill, does not randomize before assigning. 
        GroupMaker groupMaker = new GroupMaker(groupSize, classlist);
        
        //Set GroupSizingStrategy
        if (guaranteeGroupSize) {
            groupMaker.setGss(new GSS1()); 
        }       
        else {
            groupMaker.setGss(new GSS2()); 
        }
        
        //Set SkillBalancingStrategy
        if (balanceSkill) {
            groupMaker.setSbs(new SBS2()); 
        }
        else if (randomize) {
            groupMaker.setSbs(new SBS4()); 
        }
        else if (sequential) {
            groupMaker.setSbs(new SBS1()); 
        }
        
        groupMaker.generateGroups();
        groupList = groupMaker.getGroupList();  
    }
}
