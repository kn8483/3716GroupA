package profgrouping;

import java.util.ArrayList;

public interface GroupMakingStrategy {
	public void makeGroups(int groupSize, ArrayList<Group> groupList, ArrayList<Student> classList); 
}