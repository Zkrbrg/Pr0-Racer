import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle extends Moving_object
{
    
    
    
    
    public Obstacle()
    {
        getImage().scale(110, 95);
        
    }
    
    /**
     * Act - do whatever the obstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveObstacle();
       
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }    
}
