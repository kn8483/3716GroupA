package profgrouping.strategies.interfaces; 

import java.util.ArrayList;
import profgrouping.Group; 
import profgrouping.Student; 

public interface ForbiddenPartnerStrategy {
	public void preventGroups(ArrayList<Group> groupList, ArrayList<Student> classList);
}
