package profgrouping;

import java.util.ArrayList; 

public class GMS1 implements GroupMakingStrategy {

	public void makeGroups(int groupSize, ArrayList<Group> groupList, ArrayList<Student> classList) {
		
		while (classList.size() >= groupSize) {
			Group newGroup = new Group(groupSize); 
			while (!(newGroup.isFull())) {
				newGroup.add(classList.get(0), classList);
			}
			groupList.add(newGroup); 
		}
		
		if (!(classList.isEmpty())) { //There are (class.size() % groupSize) leftover students.
			Group leftover = new Group(groupSize); 
			while (!(classList.isEmpty())) { 
				leftover.add(classList.get(0), classList); 
			}
			groupList.add(leftover); 
		}
	}
		
}