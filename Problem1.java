
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        frontclear();
    }
    public void frontclear(){
        while(frontIsClear()){
            move();
        }
        if(!frontIsClear()){
            turnLeft();
        }
        while(frontIsClear()){
            move();
        }
        turnLeft();
        checkWall();
        checkWall();
        checkWall();
       
}
    public void checkWall(){
        move();
        turnRight();
        if(frontIsClear()){
            move();
        }
        else{
            turnLeft();
        }
        
        
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
        
    }
}

