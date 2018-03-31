import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lines here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lines extends Moving_object
{
    /**
     * Act - do whatever the lines wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveLines();
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }  
    
    public Lines()
    {
        getImage().scale(200, 95);
    }
}
