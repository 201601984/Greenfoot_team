import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class t here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor //implements TurtleInterface, Freezable
{
    int counter=100;
    int freezeTime = 100;
    int moveTime = 50;
    public void act() 
    {
        //int a = 1+(int)(Math.random()*350);
        
        /*if(isAtEdge()){
        turn(a); 
       }*/
       if(isAtEdge()){
           turn(17); 
        }
        if(counter<=0) {
            if(Greenfoot.getRandomNumber(100)<10) {
                turn(Greenfoot.getRandomNumber(90)-45);
            }
            move(1);
        }if(counter==-moveTime)freeze(freezeTime);
        else counter--;
    }
    public void freeze(int count) {
        counter = count;
    }
}
