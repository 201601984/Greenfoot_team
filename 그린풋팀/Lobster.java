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
        int score = 20;
        if(isAtEdge()){
        turn(a); 
       }
       if(score>0){
        score--;
       }
       else{
        turn(a);
        score = 20;
       }
    }
    private void lookForCrab(){
       if(isTouching(Crab.class))
            removeTouching(Crab.class);
       if(isTouching(Worm.class))
            removeTouching(Worm.class);
    }
}
