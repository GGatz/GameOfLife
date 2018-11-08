

package gameoflife;

import java.util.HashMap;

/**
 *
 * @author Gatsby
 */
public class statMap {
    
    public static HashMap<String, Integer> createMap()
    {
        HashMap<String, Integer> statMap= new HashMap<String, Integer>();
        statMap.put("INT", 0);
        statMap.put("STR", 0);
        statMap.put("DEX", 0);
        statMap.put("CON", 0);
        
        return statMap;
    }
}
