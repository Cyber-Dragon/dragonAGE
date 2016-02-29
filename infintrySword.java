import java.util.ArrayList;
import java.lang.Math;
/**
 * Write a description of class sword here.
 * 
 * @author (your  ) 
 * @version (a version number or a date)
 */
public class infintrySword extends Weapon {
    private String name;
    private ArrayList stats;
    private int hp;
    private String rare;
    private String ab; //define hp and other stuff hear
    public infintrySword(String name_, String Rare, String abc, int hitp){
        super(Rare, hitp, abc);
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
}
