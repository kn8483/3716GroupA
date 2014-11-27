package profgrouping.strategies.implementations.PGCS; 

import profgrouping.strategies.interfaces.PartialGroupCompletionStrategy;
import java.util.ArrayList;
import profgrouping.Group; 
import profgrouping.Student; 

public class PGCS1 implements PartialGroupCompletionStrategy {

    public void completeGroups(ArrayList<Group> groupList, ArrayList<Student> classList) {

        if(groupList == null || groupList.isEmpty()) {}

        else{
            for (Group g : groupList){
                if(!g.isEmpty() && !g.isFull()){
                    while (!g.isFull() && !classList.isEmpty()){
                        g.addStudent(classList.get(0));
                        classList.remove(0);
                    }
                }
            }
        }
    }
}
	

