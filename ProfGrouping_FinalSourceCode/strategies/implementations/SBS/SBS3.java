package profgrouping.strategies.implementations.SBS; 

import profgrouping.strategies.interfaces.SkillBalancingStrategy;
import java.util.ArrayList;
import profgrouping.Group; 
import profgrouping.Student;
import java.util.Collections; 

// This is based on Xiao's algorithm and is not complete for unbalanced group sizes

public class SBS3 implements SkillBalancingStrategy {

	public void groupByScore(int groupSize, ArrayList<Group> groupList, ArrayList<Student> classList) {
		Collections.sort(classList); 
	    ArrayList<Student> classListCopy = new ArrayList<Student>();
	    int k = 0; 
	    for (Student s : classList){
	    	classListCopy.add(s);
	    }
	    classList.clear();
	    int i=0;
	    if (classListCopy.size()%groupSize != 0){
	    	groupSize = groupSize+1;
	    }
		for(boolean isEven=false; i< classListCopy.size(); isEven=!isEven){
		    for (int j=0; j< groupSize && i <= classListCopy.size(); i++, j++){
		    	if(isEven){
		    		k=((i/groupSize+1)*groupSize)-j-1;
		    		if (k<classListCopy.size()){
		    		classList.add(classListCopy.get(k));
		    		}
		    	}
		    	else
		    		classList.add(classListCopy.get(i));	    	
		    }
		}
		for (Student s : classList){
			System.out.print(s.getScore()+", ");
		}
		int listPartition = classList.size()/groupSize;
	    if (classList.size()%groupSize > 0){ 
		    listPartition = listPartition + 1;
	    }
        int studentEnumer = 0;		    
        for (Group g : groupList){
        	if (g.isEmpty()){
		        int j = studentEnumer;
		        while (! g.isFull() && j < classList.size()){
			        g.addStudent(classList.get(j));
			        j+= listPartition;
		        }
		    studentEnumer++;
	        }
        }   
	}
}
