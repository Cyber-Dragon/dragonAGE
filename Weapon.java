import java.util.ArrayList;
/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Weapon extends Item  implements WeaponInterface, DefenseCommands ,Bankai{

    private String rarity;
     private String name;
    private ArrayList stats;
    protected int hitPoints;
    private String ability;

    public Weapon(String rare,int hp, String ab){
        ArrayList Stats = new ArrayList();
        rarity = rare;
        hitPoints = hp;
        ability = ab;
        Stats.add(rare);
        Stats.add(hp);
    }

    public void hit(){
        System.out.println("you hit that guy ");
    }

    public void sethp(int x){
        hitPoints = x;
    }

    public boolean parry(){
        return true ;
    }

    public boolean blocked(){
        return false ;
    }

}
