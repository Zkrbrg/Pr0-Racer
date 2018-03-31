import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    
    int moveSpeed = 2;
    int life = 3;
    
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("W"))
        {
            setLocation(getX(), getY() - (int)(moveSpeed * 1));
        }
        
        if(Greenfoot.isKeyDown("S"))
        {
            setLocation(getX(), getY() + (int)(moveSpeed * 1));
        }
        
        if(Greenfoot.isKeyDown("A"))
        {
            setLocation(getX() - (int)(moveSpeed * 2), getY());
        }
        
        if(Greenfoot.isKeyDown("D"))
        {
            setLocation(getX() + (int)(moveSpeed * 2), getY());
        }
        obstacleDetection();
        barrierDetection();
    }    
    
        public Player()
    {
        getImage().scale(200, 95);
    }
    
     public void barrierDetection(){
        Actor barrier_ = getOneIntersectingObject(Barrier.class); 
        
        if(barrier_ != null)
        {
            getWorld().removeObject(this);
            Gameover loseworld = new Gameover();
            Greenfoot.setWorld(loseworld);
        }
    }
    
    public void obstacleDetection(){
        Actor obstacle_ = getOneIntersectingObject(Obstacle.class); 
        
        if(obstacle_ != null)
        {
           getWorld().removeObject(obstacle_);   
           life--;
           
           if(life == 0){
               getWorld().removeObject(this);
               Gameover loseworld = new Gameover();
               Greenfoot.setWorld(loseworld);
            }
        }
    }
}
