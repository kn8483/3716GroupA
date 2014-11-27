package profgrouping.strategies.implementations.GSS; 

/** This implementation simply puts 
* however many 'leftover' students in
* the last group.
*/

import profgrouping.strategies.interfaces.GroupSizingStrategy;
import java.util.ArrayList;
import profgrouping.Group; 
import profgrouping.Student;

public class GSS2 implements GroupSizingStrategy {

	public void assignGroupSizes(int groupSize, ArrayList<Group> groupList, ArrayList<Student> classList) {
            int studentsRemainder = classList.size()% groupSize;
            int numOfGroups = classList.size()/groupSize;
            if ( studentsRemainder > 0){
                    numOfGroups = numOfGroups+1;
            }
            for (int i = 0; i < numOfGroups; i++ ){
                    groupList.add(new Group(groupSize));
            }
            if (studentsRemainder > 0 ) {
                    groupList.get(groupList.size()-1).setSize(studentsRemainder);			
            }
            
            //Set group numbers
            for (int i = 0; i <= groupList.size() - 1; i++) {
                int groupNumber = i + 1;
                groupList.get(i).setGroupNumber(groupNumber);
            }
	}
}
