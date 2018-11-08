package gameoflife;

import java.util.HashMap;

/**
 *
 * @author Gatsby
 */

public class Goal {
    
    String name ,discription, type;
    public void makeGoal(String name, int reward, String type, String description)
    {
        //uses statMap class to create a hashmap with the stat names assigned and defaults to 0 for all stats
        HashMap<String, Integer> rewardStat = statMap.createMap();
        rewardStat.put(type, reward);
        
        this.name = name;
 //spellcheck    vvv----- && ----vvv
        this.discription = description;
        this.type = type;
    }

    void completeGoal()
    {
        //TODO: add code for the competion of goals
        
    }
    
    void abandonGoal()
    {
        //TODO: add code for removing of goals that have already been accepted
    }
    
    void acceptNewGoal()
    {
        //TODO: add code for accepting new goals
    }
}
