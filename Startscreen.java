import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startscreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startscreen extends World
{
    public void act()
    {
        if(Greenfoot.isKeyDown("SPACE"))
        {
            Background gameworld = new Background();
            Greenfoot.setWorld(gameworld);
        }
    }
    /**
     * Constructor for objects of class startscreen.
     * 
     */
    public Startscreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1105, 606, 1);
    }
}
