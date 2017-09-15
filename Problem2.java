
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
        placeBeeper();
        reposition();
    }
    public void placeBeeper() {
        putBeeper();
    }
    public void findWall(){
       
        if(!frontIsClear()){
            turnRight();
        }
        move();
        turnLeft();
        
        if(!frontIsClear()){
            putBeeper();
            turnRight();
        }
        else{
            move();
            turnLeft();
            move();
            putBeeper();
        }
    }
    public void reposition(){
        for(int x=0; x<20; x++){
            findWall();
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

