 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        moveInside();
        examineRoom();
    }
    
    public void moveInside() {
        turnLeft();
        move();
        turnRight();
        while(frontIsClear()){
            move();
        }
        turnRight();
    }
    
    public void examineRoom() {
        for (int i=0; i<22; i++) {
            turnLeft();
            if(frontIsClear()) {
                putBeeper();
                turnRight();
                if(!frontIsClear()) {
                    turnRight();
                }
                move();
            }
            else{
                turnRight();
                if(!frontIsClear()) {
                    turnRight();
                }
                move();
            }
        }
        
    }
    
    public void reverse() {
        turnLeft();
        turnLeft();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    
   
}

