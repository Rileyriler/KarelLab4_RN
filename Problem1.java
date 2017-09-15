
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void escapeRoom() {
        moveToWall();
        examineWall();
    }
    
    public void moveToWall() {
        while(frontIsClear()) {
            move();
        }
        turnLeft();
        examineWall();
    }
    
    public void examineWall() {
        probeArea();
    }
    
    public void probeArea() {
        turnRight();
        if(!frontIsClear()){
            turnLeft();
            if(!frontIsClear()) {
                turnLeft();
            }
            else{
                move();
                probeArea();
            }
        }
        else{
            move();
        }
    }
}

