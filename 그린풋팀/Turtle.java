import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class t here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Lobster implements TurtleInterface, Freezable
{
    int counter = 200;
    public void act() {
       lookForLobster();
       if(counter>100){
           counter--;
           
       }
       else if(counter<=100&&counter>0){
           super.ranMove(1);
           counter--;
       }
       else{
           freeze(200);
        }
        lookForLobster();
    }
    public void lookForLobster(){
       if(isTouching(Lobster.class))
            removeTouching(Lobster.class);
    }
    public void freeze(int count){
       counter = count;
    }
}
