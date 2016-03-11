import java.util.ArrayList;
import java.lang.Math;
/**
 * Write a description of class woodArmor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class woodArmor extends Armor {
    private String name;
    private ArrayList stats;
    private int hp;
    private String rare;
    public woodArmor(String name_, String Rare, int hp){
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
        return false;
    }
    public boolean common(){
        return true;
    }

    public boolean rare(){
        return false;
    }

    public boolean eternal(){
        return false;
    }

    public boolean hero(){
        return false;
    }
}