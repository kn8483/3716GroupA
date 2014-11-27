package profgrouping.strategies.implementations.SBS; 

/** This implementation does not balance skills. 
* It just assigns students to groups one by one  
* from the studentList.
*/

import profgrouping.strategies.interfaces.SkillBalancingStrategy;
import java.util.ArrayList;
import profgrouping.Group; 
import profgrouping.Student; 

public class SBS1 implements SkillBalancingStrategy { 
	public void groupByScore(int groupSize, ArrayList<Group> groupList, ArrayList<Student> studentList) {
		for (Group g : groupList){
			if (g.isEmpty()){
				while(!g.isFull() && !studentList.isEmpty()){
				    g.addStudent(studentList.get(0));
				    studentList.remove(0);
				}
			}
		}
	
	}		
}