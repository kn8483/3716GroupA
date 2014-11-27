package profgrouping.strategies.implementations.FPS; 

import profgrouping.strategies.interfaces.ForbiddenPartnerStrategy;
import java.util.ArrayList; 
import profgrouping.Group; 
import profgrouping.Student; 

public class FPS1 implements ForbiddenPartnerStrategy { 

	public void preventGroups(ArrayList<Group> groupList, ArrayList<Student> classList) {
		
		 ArrayList<Student> stdsWthFrbdPrtnrs = new ArrayList<Student>();
		 for (Student s : classList){
	        	if (! (s.getForbiddenPartners() == null) &&! s.getForbiddenPartners().isEmpty()){
	        		stdsWthFrbdPrtnrs.add(s);	
	        	}
		 }
	     for (Group g : groupList ){
	        	if (!g.isFull() && !stdsWthFrbdPrtnrs.isEmpty() && !g.hasForbiddenStudent(stdsWthFrbdPrtnrs.get(0))){
	        		g.addStudent(stdsWthFrbdPrtnrs.get(0));
	        		classList.remove(stdsWthFrbdPrtnrs.get(0));
	        		g.setUnaddableMembers(stdsWthFrbdPrtnrs.get(0).getForbiddenPartners());
	        		stdsWthFrbdPrtnrs.remove(0);
	        	}
	     }
	     if (! stdsWthFrbdPrtnrs.isEmpty()){
	    	 for (Group g : groupList){
	    		 if (!stdsWthFrbdPrtnrs.isEmpty() && !g.hasForbiddenStudent(stdsWthFrbdPrtnrs.get(0))){
	    			 g.addStudent(stdsWthFrbdPrtnrs.get(0));
	    			 classList.remove(stdsWthFrbdPrtnrs.get(0));
	    			 g.setUnaddableMembers(stdsWthFrbdPrtnrs.get(0).getForbiddenPartners());
	    			 stdsWthFrbdPrtnrs.remove(0);
	    		 }
	    	 }
	     }
	     if (! stdsWthFrbdPrtnrs.isEmpty()){
	    	 for (Student s : stdsWthFrbdPrtnrs){
	    		 Group additionalGroup = new Group(1);
	    		 additionalGroup.addStudent(s);
	    		 additionalGroup.setUnaddableMembers(s.getForbiddenPartners());
	    		 groupList.add(additionalGroup);
	    	 }
	     }	        			
	 }
}
		
