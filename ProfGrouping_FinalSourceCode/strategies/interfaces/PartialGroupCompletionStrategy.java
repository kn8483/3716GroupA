package profgrouping.strategies.interfaces; 

import java.util.ArrayList;
import profgrouping.Group; 
import profgrouping.Student;

public interface PartialGroupCompletionStrategy {
	public void completeGroups(ArrayList<Group> groupList, ArrayList<Student> classList);
}
