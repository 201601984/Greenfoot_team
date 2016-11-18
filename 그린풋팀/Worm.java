import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class s here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worm extends Actor implements WormInterface
{
    int removeTime = 430;
    public void act() 
    {
       remove();
    } 
    public void remove(){
       if(removeTime<=0)
            getWorld().removeObject(this);
       else
            removeTime --;
    }
}
