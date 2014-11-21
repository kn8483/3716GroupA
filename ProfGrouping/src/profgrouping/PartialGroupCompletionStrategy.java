package profgrouping;

import java.util.ArrayList;

public interface PartialGroupCompletionStrategy {
	public void completeGroups(ArrayList<Group> groupList, ArrayList<Student> classList);
}
