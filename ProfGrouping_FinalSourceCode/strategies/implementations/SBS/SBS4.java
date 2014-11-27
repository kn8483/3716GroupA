package profgrouping.strategies.implementations.SBS; 

/** This implementation does not balance skills. 
* It randomizes the studentList, then assigns student  
* one by one.
*/

import profgrouping.strategies.interfaces.SkillBalancingStrategy;
import java.util.ArrayList;
import java.util.Collections;
import profgrouping.Group; 
import profgrouping.Student; 

public class SBS4 implements SkillBalancingStrategy { 
	public void groupByScore(int groupSize, ArrayList<Group> groupList, ArrayList<Student> studentList) {
                
                //Shuffle class list, so won't result in a primarily alphabetical grouping. 
                Collections.shuffle(studentList);
                
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
