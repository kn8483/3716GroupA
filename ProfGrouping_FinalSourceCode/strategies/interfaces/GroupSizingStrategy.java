package profgrouping.strategies.interfaces; 

import java.util.ArrayList;
import profgrouping.Group; 
import profgrouping.Student;

public interface GroupSizingStrategy {
	public void assignGroupSizes(int groupSize, ArrayList<Group> groupList, ArrayList<Student> classList); 
}