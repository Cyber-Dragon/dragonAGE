
/**
 * Write a description of interface ability here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ability{
    /**
     * enemy is cut deeply and bleeds out faster with every hit  
     * @returns true if ability is active 
     */
   boolean bloodDrain();
   /**
    * steals life frome anemy and give it to you
    * @returns true if ability is active 
    */
   boolean soulSteal();
   /**
    * gains attck everytime their helth gets low
    * retuens true if ability is avtive 
    */
   boolean rage();
   /**
    * gains every ability 
    * retuens true if ability is avtive 
    */
   boolean zimZamBom();
}
