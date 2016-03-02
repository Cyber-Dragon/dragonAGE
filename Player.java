
/**
 * Abstract class Player - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class Player{
    public String firstName;
    public  String lastName;
    public String ability;
    public String wepon;
    public String armor;
    public int lV; 

    public Player(){
        this("Higuera","Luis","RAGE + 100000 Atck Power","Carries DEATHSYTHE with blood drain ability","Carries DraGon Slayer Armor that cancells your abilitys",90000);

    }

    public Player(String firstName_, String lastName_,String ability_,String wepon_,String armor_, int lV_){
        firstName = firstName_;
        lastName = lastName_;
        ability = ability_;
        wepon = wepon_;
        armor = armor_;
        lV = lV_;
    }

    public int getlV(){
        return lV;
    }

    public String firstName_(){
        return lastName;
    }

    public String ability (){
        return ability ;
    }
    
     public String wepon(){
        return wepon ;
    }
    
     public String armor(){
        return armor;
    }
}
