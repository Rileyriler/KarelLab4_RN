
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
   public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
   }
    
   public void plantBeepers() {
       placeBeepersAlongWall();
   }
    
   public void placeBeepersAlongWall() {
       while(!nextToABeeper()) {
           turnLeft();
           if(!frontIsClear()) {
               putBeeper();
               turnRight();
               move();
           }
           else{
               putBeeper();
               move();
               putBeeper();
               turnLeft();
               move();
           }
           while(!frontIsClear()){
               turnRight();
           }
       }
   }
   
   public void faceEast() {
       while(!facingEast()) {
           turnLeft();
       }
   }
   
   public void turnRight() {
       turnLeft();
       turnLeft();
       turnLeft();
    }
}

