package profgrouping;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maria
 */
public class SessionController {
    
    private ArrayList<Student> classList3715; 
    private ArrayList<Student> classList3716; 
    
    public SessionController() {
        classList3715 = new ArrayList<Student>();
        classList3716 = new ArrayList<Student>(); 
        String[] courseNames = {"COMP3715", "COMP3716"}; 
        for (String courseName: courseNames) {
            ArrayList<Student> list = null; 
            switch (courseName) {
                case "COMP3715":
                    list = classList3715;
                    break;
                case "COMP3716":
                    list = classList3716; 
                    break;
            }
            
            
            String filename = courseName + "_classlist.txt"; 
            File inputFile = new File(filename);
            Scanner scan = null; // NullPointerException doesn't prevent compiling
            try {
                scan = new Scanner(inputFile);
                while (scan.hasNextLine()) {
                    String name = scan.nextLine();
                    Student student = new Student(name); 
                    list.add(student);
                }
            } 
            catch (FileNotFoundException ex) {
                System.out.println("The file" + filename + " does not exist!");
            }
        } 
    }
    
    public String getClassListString(String courseName) {
        ArrayList<Student> list = null; 
        switch (courseName) {
            case "COMP3715":
                list = classList3715;
                break;
            case "COMP3716":
                list = classList3716; 
                break;
        }
        String toReturn = "";  
        for (int i = 0; i < list.size(); i++) {
                int nameCount = i + 1;
                toReturn += "Name " + nameCount + ": " + list.get(i).getName() +"\n"; 
        }
        return toReturn; 
    }
    
    public String getGroupListString(String courseName) {
        String groupListFileName = courseName + "_groupList.txt"; 
        File groupListFile = new File(groupListFileName);
        String toReturn = ""; 
        Scanner scan;
        try {
            scan = new Scanner(groupListFile);
            while (scan.hasNextLine()) {
                toReturn += scan.nextLine();
                toReturn += "\n";
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Exception while constructing Scanner.");
        }       
        return toReturn; 
    }
    
    public void callGroupMaker(String courseName, int groupSize) {
        ArrayList<Student> list = null; 
        switch (courseName) {
            case "COMP3715":
                list = classList3715;
                break;
            case "COMP3716":
                list = classList3716; 
                break;
        }
        
        GroupMaker gm = new GroupMaker(courseName, groupSize, list);
        gm.generateGroups(); //makes groups and writes to file courseName_groupList.txt
        
    } 
}
