import java.util.ArrayList;
import java.lang.Math;
/**
 * Write a description of class dimondArmor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dimondArmor extends Armor{
    private String name;
    private ArrayList stats;
    private String rare;
    public dimondArmor(String name_, String Rare, int hp){
        stats = new ArrayList();
        name = name_;
    }

    public ArrayList getStats(){

        return stats;
    }

    public String getName(){
        return name;
    }
    
    public  boolean zimZamBom(){
        return false;
     }

    public boolean rage(){
        return false;
     }

    public boolean soulSteal(){
        return false;
     }

    public boolean bloodDrain(){
        return true;
    }
    public boolean common(){
        return false;
    }

    public boolean rare(){
        return false;
    }

    public boolean eternal(){
        return false;
    }

    public boolean hero(){
        return true;
    }
}