package profgrouping.strategies.implementations.MPS; 

import profgrouping.strategies.interfaces.MandatoryPartnerStrategy;
import java.util.ArrayList;
import profgrouping.Group; 
import profgrouping.Student; 


public class MPS1 implements MandatoryPartnerStrategy {
	
	public void enforceGroups(ArrayList<Group> groupList, ArrayList<Student> classList){
		for(int i = 0; i < classList.size(); i++){
			Student s = classList.get(i);
        	if (! (s.getMandatoryPartners() == null) && ! s.getMandatoryPartners().isEmpty()){
        		ArrayList<Student> mandatoryGroup = new ArrayList<Student>();
        		mandatoryGroup.add(s);
        		
        		for (Student sPartner : s.getMandatoryPartners()){
        			mandatoryGroup.add(sPartner);
        		}
        		
        		Group mandGroup = Group.getEmptyGroup(groupList);
        		
        		if (!(mandGroup == null)){
        			mandGroup.setGroupList(mandatoryGroup);
        			for (Student std : mandatoryGroup){
        				classList.remove(std);
        			}
        		}
        		
        		else if (mandGroup == null){
        			Group additionalGroup = new Group(mandatoryGroup.size());
        			additionalGroup.setGroupList(mandatoryGroup);
        			for (Student std : mandatoryGroup){
        				classList.remove(std);
        			}
				} 
        	}
        } 
    }
}

