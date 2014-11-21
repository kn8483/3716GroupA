package profgrouping;

import java.util.ArrayList;

public interface ForbiddenPartnerStrategy {
	public void preventGroups(ArrayList<Group> groupList, ArrayList<Student> classList);
}
