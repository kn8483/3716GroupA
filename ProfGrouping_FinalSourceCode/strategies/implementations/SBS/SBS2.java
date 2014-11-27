package profgrouping.strategies.implementations.SBS; 

/** This implementation does balances the skill 
* of the groups by sorting them by score.  
*/


import profgrouping.strategies.interfaces.SkillBalancingStrategy;
import java.util.ArrayList;
import profgrouping.Group; 
import profgrouping.Student;
import java.util.Collections; 
 
// Kinda balances skills depending on how lucky you are =) 
public class SBS2 implements SkillBalancingStrategy { 
	
	public void groupByScore(int groupSize, ArrayList<Group> groupList, ArrayList<Student> studentList) {
            Collections.sort(studentList);
            if (! isGSS2(groupSize, groupList,  studentList)){
                int listPartition = studentList.size()/groupSize;
                if (studentList.size()%groupSize > 0){ 
                        listPartition = listPartition + 1;
                }
                int studentEnumer = 0;		    
                for (Group g : groupList){
                        if (g.isEmpty()){
                                int j = studentEnumer;
                                while (! g.isFull() && j < studentList.size()){
                                        g.addStudent(studentList.get(j));
                                        j+= listPartition;
                                }
                                studentEnumer++;
                        }
                }	   
            }
		
            else {
                    int listPartition = studentList.size()/groupSize;
                    int studentEnumer = 0;		    
            for (int i=0; i < groupList.size()-1; i++){
                    if (groupList.get(i).isEmpty()){
                            int j = studentEnumer;
                            while (! groupList.get(i).isFull() && j < studentList.size()){
                                    groupList.get(i).addStudent(studentList.get(j));
                                    j+= listPartition;
                            }
                            studentEnumer++;
                    }
            }
            for(int i = groupList.get(groupList.size()-1).getSize(); i >0; i--){
                    Group g = groupList.get(groupList.size()-1);
                    g.addStudent(studentList.get(studentList.size()-1));
                    studentList.remove(studentList.get(studentList.size()-1));   		
            }
            }	
        }
        
            public static boolean isGSS2(int groupSize, ArrayList<Group> groupList, ArrayList<Student> studentList){
                if (groupList.get(groupList.size()-1).getSize() != studentList.size()% groupSize){
                        return false;
                }
                for(int i = 0; i<groupList.size()-1; i++){
                        if (groupList.get(i).getSize() != groupSize){
                                return false;
                        }
                }
                return true;
            }	
}
	
