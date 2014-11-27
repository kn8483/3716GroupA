package profgrouping; 

import java.util.ArrayList;
import profgrouping.strategies.interfaces.*;
import profgrouping.strategies.implementations.FPS.*;
import profgrouping.strategies.implementations.MPS.*;
import profgrouping.strategies.implementations.PGCS.*;
import profgrouping.strategies.implementations.SBS.*;
import profgrouping.strategies.implementations.GSS.*;  

public class GroupMaker {

    private int groupSize;
    private ArrayList<Student> classList; 
    private ArrayList<Group> groupList; 

    private MandatoryPartnerStrategy mps;
    private ForbiddenPartnerStrategy fps;
    private PartialGroupCompletionStrategy pgcs;
    private SkillBalancingStrategy sbs;
    private GroupSizingStrategy gss;

    public GroupMaker(int groupSize, ArrayList<Student> classList) {
            this.groupSize = groupSize;
            this.classList = new ArrayList<Student>(); 
            for (Student s : classList) { //Make deep copy for working on.
                    this.classList.add(s); 
            }
            groupList = new ArrayList<Group>();
            
            //Default Strategies
            gss = new GSS1(); // Make empty groups and allocate # of members per group gss1 balances# of people per group
            mps = new MPS1(); // Put mandatory partners in the same group
            fps = new FPS1(); // Put forbidden partners in different groups
            pgcs = new PGCS1(); // Complete groups with #of members < assigned group size 
            sbs = new SBS2(); // Balance scores (sbs2) or do not balance (sbs1)... Note* sbs3 does not work properly

    }

    public void generateGroups() {
        gss.assignGroupSizes(groupSize, groupList, classList);
        mps.enforceGroups(groupList, classList);
        fps.preventGroups(groupList, classList);
        pgcs.completeGroups(groupList, classList);
        sbs.groupByScore(groupSize, groupList, classList);		
    }

    public void setGroupList(ArrayList<Group> groupList) {
            this.groupList = groupList;
    }

    public ArrayList<Group> getGroupList() {
            return groupList;
    }

    public void setMps(MandatoryPartnerStrategy mps) {
        this.mps = mps;
    }

    public void setFps(ForbiddenPartnerStrategy fps) {
        this.fps = fps;
    }

    public void setPgcs(PartialGroupCompletionStrategy pgcs) {
        this.pgcs = pgcs;
    }

    public void setSbs(SkillBalancingStrategy sbs) {
        this.sbs = sbs;
    }

    public void setGss(GroupSizingStrategy gss) {
        this.gss = gss;
    }
        	
}