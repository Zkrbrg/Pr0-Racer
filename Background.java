import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    int spawnObstaclePos = 0;
    private Timer spawnTimerObstacle = new Timer(2600);
    private Timer spawnTimerLines = new Timer(1000);
    
    public void act()
    {
        spawnObstacle();
        spawnLines();
    }
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Background()
    {    
        // Create a new world with 1105x606 cells with a cell size of 1x1 pixels.
        super(1105, 606, 1); 
        setPaintOrder(Player.class, Obstacle.class, Lines.class);
        
        addObject(new Counter(), 150, 40);
        
        addObject(new Player(), 150, 303);
        addObject(new Lines(), 1050, 225);
        addObject(new Lines(), 1050, 375);
        addObject(new Lines(), 700, 225);
        addObject(new Lines(), 700, 375);
        addObject(new Lines(), 350, 225);
        addObject(new Lines(), 350, 375);
        addObject(new Lines(), 0, 225);
        addObject(new Lines(), 0, 375);
        
        addObject(new Barrier(), 50, 40);
        addObject(new Barrier(), 300, 40);
        addObject(new Barrier(), 550, 40);
        addObject(new Barrier(), 800, 40);
        addObject(new Barrier(), 1050, 40);
        addObject(new Barrier(), 50, 565);
        addObject(new Barrier(), 300, 565);
        addObject(new Barrier(), 550, 565);
        addObject(new Barrier(), 800, 565);
        addObject(new Barrier(), 1050, 565);
   }
    
    public void spawnObstacle(){
        if(spawnTimerObstacle.checkTime()){
            spawnObstaclePos = Greenfoot.getRandomNumber(3);
            if(spawnObstaclePos == 0){
                addObject(new Obstacle(), 900, 160);
            } else if (spawnObstaclePos == 1){
                addObject(new Obstacle(), 900, 303);
            } else if (spawnObstaclePos == 2){
                addObject(new Obstacle(), 900, 430);
            }
        }
    }
    
   public void spawnLines(){
       if(spawnTimerLines.checkTime()){
           addObject(new Lines(), 1050, 225);
           addObject(new Lines(), 1050, 375);
       }
   }
}