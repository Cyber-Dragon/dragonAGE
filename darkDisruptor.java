import java.util.ArrayList;
import java.lang.Math;
/**
 * Write a description of class darkDisruptor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class darkDisruptor extends Weapon{
    private String name = "darkDisruptor" ;
    private ArrayList stats;
    private int hp;
    private String rare;
    private String ab;
    public darkDisruptor(String name_, String Rare, String ab, int hitp){
        super(Rare, hitp, ab);
        stats = new ArrayList();
        name = "darkDisruptor";
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
        return false ;
    }
}
