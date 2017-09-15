
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        collectBeeperSteeple();
    }
    
    public void collectBeeperSteeple() {
        while(frontIsClear()) {
            
            findBeepers();
            collectBeeper();
            moveBack();
        }
    }
    
    public void findBeepers() {
        faceEast();
        while(!nextToABeeper() && frontIsClear()) {
            
                move();
            
        }
        collectBeeper();
    }
    
    public void collectBeeper() {
        
            turnLeft();
            while(nextToABeeper()) {
                pickBeeper();
                move();
            }
            moveBack();
        
    }
    
    public void moveBack() {
        faceSouth();
        while(frontIsClear()) {
            move();
        }
        faceEast();
        //collectBeeperSteeple();
    }
    
    public void faceEast() {
        while(!facingEast()){
            turnLeft();
        }
    }
    
    public void faceSouth() {
        while(!facingSouth()) {
            turnLeft();
        }
    }
   
}