import java.util.ArrayList;
import java.lang.Math;
/**
 * Write a description of class fullDragonArmor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fullDragonArmor {
    private String name;
    private ArrayList stats;
    private int hp;
    private String rare;
    public fullDragonArmor(String name_, String Rare, int hp){
       // super(Rare, hp);
        stats = new ArrayList();
        name = name_;
    }

    public ArrayList getStats(){

        return stats;
    }

    public String getName(){
        return name;
    }

    public int attack(){
        return hp;
    }

    boolean storeItem(Item x){
        return false ;
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
}