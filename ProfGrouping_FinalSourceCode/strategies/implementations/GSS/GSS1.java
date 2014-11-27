package profgrouping.strategies.implementations.GSS; 

/**
* This implementation ensures that every group
* is no smaller than one less than the specified 
* size. 
*/

import profgrouping.strategies.interfaces.GroupSizingStrategy;
import java.util.ArrayList;
import profgrouping.Group; 
import profgrouping.Student; 

public class GSS1 implements GroupSizingStrategy {
		
	public void assignGroupSizes(int groupSize, ArrayList<Group> groupList, ArrayList<Student> classList) {
            int classSize = classList.size(); 
            int numOfGroups = classSize / groupSize;		
	    int reducedGroups = getNumOfReducedGroups(classSize, groupSize);
	    if (reducedGroups > 0){
	       numOfGroups = numOfGroups - reducedGroups + 1;
	    }
			
	    for (int i = 0; i < numOfGroups; i++){
		    groupList.add(new Group(groupSize));
	    }
	    if (reducedGroups > 0){ 
		    for (int i = 0; i < reducedGroups; i++){
			    groupList.add(new Group(groupSize-1)); 
		    }
	    }
            
            //Set Group Numbers
            for (int i = 0; i <= groupList.size() - 1; i++) {
                int groupNumber = i + 1;
                groupList.get(i).setGroupNumber(groupNumber);
            }
	}
	
	//Helper method
	public int getNumOfReducedGroups(int classSize, int groupSize){
		int groupSizeRemainder = classSize % groupSize;
		if (groupSizeRemainder > 0){			
		    return groupSize - groupSizeRemainder;		
		}
		return 0;		
    }			
}