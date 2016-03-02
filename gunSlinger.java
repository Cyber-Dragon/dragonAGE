import java.util.ArrayList;
import java.lang.Math;
/**
 * Write a description of class gunSlinger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gunSlinger extends Weapon{
    private String name;
    private ArrayList stats;
    private int hp;
    private String rare;
    private String ab;
    public gunSlinger(String name_, String Rare, String ab, int hp){
        super(Rare, hp, ab);
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
}