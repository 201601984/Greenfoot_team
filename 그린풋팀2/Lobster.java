import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class e here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor //implements LobsterInterface
{
    public void act() 
    {
         //int a = 1+(int)(Math.random()*350);
        move(2);
        /*if(isAtEdge()){
        turn(a); 
       }*/
       if(isAtEdge()){
           turn(17); 
        }
       if(Greenfoot.getRandomNumber(100)<10) {
           turn(Greenfoot.getRandomNumber(90)-45);
        }
       if(isTouching(Crab.class)) {
            removeTouching(Crab.class);
        }
       if(getOneObjectAtOffset(0,0,Turtle.class)!=null){
            getWorld().removeObject(this);
            
        } 
        
    }
}
