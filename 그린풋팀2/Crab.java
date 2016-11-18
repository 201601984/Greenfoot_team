import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class m here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor //implements CrabInterface
  {
      private int speed = 5;
    /**
     * Act - do whatever the Lion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
      
        
        if(Greenfoot.isKeyDown("up")){
            turn(-2);
            
            
    }    
       if(Greenfoot.isKeyDown("down")){
            turn(2);
            
            
    }
       if(Greenfoot.isKeyDown("right")){
            move(3);
            
            
    }
       if(Greenfoot.isKeyDown("left")){
            move(-3);
            
            
    }
            //move(3);
         /*    if(isAtEdge()){
        turn(17); 
       }*/
       /*if(getOneObjectAtOffset(0,0,Lobster.class)!=null){
            getWorld().removeObject(this);
            //Greenfoot.stop();
        } */
    
}
}
