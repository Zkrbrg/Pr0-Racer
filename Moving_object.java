import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moving_object extends Actor
{
    
    int moveSpeed = 1;
    int obstacleMultiplaktor = 2;
    int linesMultiplaktor = 5;
    
    /**
     * Act - do whatever the obstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void moveObstacle()
    {
        setLocation(getX() - (int)(moveSpeed * obstacleMultiplaktor), getY());
   }
   
   public void moveLines()
    {
        setLocation(getX() - (int)(moveSpeed * linesMultiplaktor), getY());
   }
}
