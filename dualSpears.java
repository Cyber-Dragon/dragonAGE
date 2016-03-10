import java.util.ArrayList;
import java.lang.Math;
/**
 * Write a description of class dualSpears here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dualSpears extends Weapon{
    private String name;
    private ArrayList stats;
    private int hp;
    private String rare;
    public dualSpears(String name_, String Rare, int hp){
        super(Rare, hp);
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

    public void banki(){
        super.sethp(super.hitPoints+1000);
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