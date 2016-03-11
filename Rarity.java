
/**
 * Write a description of class Rarity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Rarity{
    /**
     * enemy is cut deeply and bleeds out faster with every hit  
     * @returns true if ability is active 
     */
   boolean common();
   /**
    * steals life frome anemy and give it to you
    * @returns true if ability is active 
    */
   boolean rare();
   /**
    * gains attck everytime their helth gets low
    * retuens true if ability is avtive 
    */
   boolean hero();
   /**
    * gains every ability 
    * retuens true if ability is avtive 
    */
   boolean eternal();
   
}
