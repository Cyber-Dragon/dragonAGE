import java.util.ArrayList;
/**
 * Write a description of class Armor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Armor extends Item  implements DefenseCommands ,ability ,Rarity{

    public Armor(){
       
    }
   
    public boolean parry(){
        return true ;
    }
    
     public  boolean blocked(){
        return true;
    }
     
    boolean storeItem(Item x){
        return false ;
    }
}
