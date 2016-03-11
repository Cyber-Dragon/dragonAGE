import java.util.ArrayList;
import java.lang.Math;
/**
 * Write a description of class gunSlinger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gunSlinger extends Weapon {
    private String name;
    private ArrayList stats;
    private int hp;
    private String rare; 
    public gunSlinger(String name_, String Rare, int hitp){
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
        //boolean block = (boolean) (Math.random() * 1 + 10.0);
        return true;
    }

    public int attack(){
        return hp;
    }

    public void banki(){
        super.sethp(super.hitPoints+1000);
    }

    public boolean blocked(){
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
        return false;
    }
    
    public boolean common(){
        return false;
    }

    public boolean rare(){
        return true;
    }

    public boolean eternal(){
        return false;
    }

    public boolean hero(){
        return false;
    }
}

