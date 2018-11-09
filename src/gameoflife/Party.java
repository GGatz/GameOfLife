

package gameoflife;

import java.util.LinkedList;

/**
 *
 * @author Gatsby
 * this class manages the party of friends which is the class that Boss Fight uses to calculate the fight
 */
public class Party {
    
    int partySize;
    LinkedList<Avatar> partyOfFriends = new LinkedList<Avatar>();
    
    void addToParty(Avatar avatar)
    {
        this.partyOfFriends.add(avatar);
        
    }
    
    void addStats(Avatar[] party)
    {
        int INT,STR,DEX,CON;
        
       for(int i  = 0;i < partyOfFriends.size(); i++)
       {   
           INT =+ partyOfFriends.get(i).avatarStats.get("INT");
           STR =+ partyOfFriends.get(i).avatarStats.get("STR");
           DEX =+ partyOfFriends.get(i).avatarStats.get("DEX");
           CON =+ partyOfFriends.get(i).avatarStats.get("CON");
           
       }
    }

}
