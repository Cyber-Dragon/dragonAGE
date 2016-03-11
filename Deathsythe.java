import java.util.ArrayList;
import java.lang.Math;
/**
 * Write a description of class Deathsythe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deathsythe extends Weapon{
    private String name;
    private ArrayList stats;
    private int hp;
    private String rare;
    public Deathsythe(String name_, String Rare, int hitp){
        super(Rare, hitp);
        stats = new ArrayList();
        name = name_;
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
    
   public  boolean zimZamBom(){
        return true;
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
        return false;
    }

    public boolean rare(){
        return false;
    }

    public boolean eternal(){
        return true;
    }

    public boolean hero(){
        return false;
    }
}

