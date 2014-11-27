package profgrouping.strategies.interfaces; 

import java.util.ArrayList;
import profgrouping.Group; 
import profgrouping.Student;

public interface MandatoryPartnerStrategy {
	public void enforceGroups(ArrayList<Group> groupList, ArrayList<Student> classList);
	     
}
