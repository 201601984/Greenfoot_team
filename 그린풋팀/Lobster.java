import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class e here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor //implements LobsterInterface
{
    int a = Greenfoot.getRandomNumber(360);
    public void act() 
    {
        ranMove(3);
        lookForCrab();
    }
    public void ranMove(int speed){
        move(speed);
        if(isAtEdge()){
        turn(a); 
       }
       if(Greenfoot.getRandomNumber(100)<7) {
           turn(Greenfoot.getRandomNumber(90)-45);
        }
    }
    private void lookForCrab(){
       if(isTouching(Crab.class))
            removeTouching(Crab.class);
       if(isTouching(Worm.class))
            removeTouching(Worm.class);
    }
}
