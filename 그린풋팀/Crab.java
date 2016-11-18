import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class m here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor implements CrabInterface
  {
    /**
     * Act - do whatever the Lion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        edge();
        lookForWorm();
    }
    public void move(){
        if(Greenfoot.isKeyDown("up")){
            turn(-2);
    }    
       if(Greenfoot.isKeyDown("down")){
            turn(2);
    }
    move(3);
    }
    public void edge(){
       if(isAtEdge()){
           turn(17); 
       }
    }
    public void lookForWorm(){
        if(isTouching(Worm.class)){
            removeTouching(Worm.class);
            MyWorld.score += eatScore;
        }
    }
}

