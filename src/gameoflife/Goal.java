package gameoflife;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gatsby
 */

public class Goal {
    
    
    int rewardStat;
    String name;
    HashMap<String, Integer> statMap;
    
    Goal(String name, int reward, String type)
    {
        this.statMap = new HashMap<String, Integer>();
        rewardStat = reward;
        this.name = name;
        statMap.put(type, reward);
        
        
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
