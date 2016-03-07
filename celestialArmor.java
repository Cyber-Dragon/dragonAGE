import java.util.ArrayList;
import java.lang.Math;
/**
 * Write a description of class celestialArmor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
    public class celestialArmor extends Armor{
    private String name;
    private ArrayList stats;
    private int hp;
    private String rare;
    public celestialArmor(String name, String Rare, String ab, int hitp){

        stats = new ArrayList();
        name = name;
    }

    public ArrayList getStats(){
        return stats;
    }

    public String getName(){
        return name;
    }

    public boolean parry(){
        return true ;
    }

    public int attack(){
        return hp;
    }

    public void banki(){
        super.sethp(super.hitPoints+1000);
    }

    public boolean blocked(){
        return true ;
    }
     
    public int countItems();
    
    public boolean storeItem(Item x){
        return false ;
    }
}