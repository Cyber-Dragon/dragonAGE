
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
    public int iD; 

    public Player(){
        this("Higuera","Luis","RAGE + 100000 Atck Power","Carries DEATHSYTHE with blood drain ability","Carries DraGon Slayer Armor that cancells your abilitys",0);

    }

    public Player(String firstName_, String lastName_,String ability_,String wepon_,String armor_, int iD_){
        firstName = firstName_;
        lastName = lastName_;
        ability = ability_;
        wepon = wepon_;
        armor = armor_;
        iD = iD_;
    }

    public int getiD(){
        return iD;
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
