package profgrouping.strategies.interfaces; 

import java.util.ArrayList;
import profgrouping.Group; 
import profgrouping.Student;

public interface SkillBalancingStrategy {
	public void groupByScore(int groupSize, ArrayList<Group> groupList, ArrayList<Student> classList);
}