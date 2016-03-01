
/**
 * Write a description of class Armor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Armor extends Item  implements DefenseCommands , BackpackInterface{
     private String rarity;
    private int hitPoints;
    private String ability;

    public Armor(String rare,String ab,int hp){
        rarity = rare;
        hitPoints = hp;
        ability = ab;
    }

}
