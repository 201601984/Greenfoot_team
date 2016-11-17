import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class s here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worm extends Actor //implements WormInterface
{
    public void act() 
    {
        if(getOneObjectAtOffset(0,0,Crab.class)!=null){
            getWorld().removeObject(this);
            MyWorld.score ++;

        } 
    } 
}
