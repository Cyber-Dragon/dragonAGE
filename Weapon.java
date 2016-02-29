import java.util.ArrayList;
/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Weapon extends Item implements WeaponInterface, Bankai{

    private String rarity;
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
        System.out.println("you ");
    }

    public void moveBackward(){
        System.out.println("you move backward");
    }

    public void sethp(int x){
        hitPoints = x;
    }

    public void turnLeft(){
        System.out.println("you turn left ");
    }

    public void turnRight(){
        System.out.println("you turn right ");
    }

    public void brake(){
        System.out.println(" Car slows to a stop ");
    }

    public void outoSpeed(){
        System.out.println(" Car outoSpeeds up ");
    }

}
