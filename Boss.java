import java.util.ArrayList;
/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Player{
    ArrayList <Player> listOfPlayers;
    public Boss(){
        listOfPlayers = new ArrayList<Player>();
        Player s1 = new Player("Luis"," Higuera","fsdf","wqe","weq",00001);
        listOfPlayers.add(s1);
    }

    public Boss (int numOfPlayers){
        listOfPlayers = new ArrayList<Player>();
        for(int i = 1; i <= numOfPlayers; i++){
            listOfPlayers.add(new Player("BURITO","TACO","","","",111101 + i));
        }
    }

    public void printPlayersList(){
        for (Player s : listOfPlayers){
           System.out.println("Name: "+ s.firstName+ s.lastName );
            System.out.println("Lv #" + s.lV);
            
        }
    }
}
