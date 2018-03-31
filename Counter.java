import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    public int score;
    private Timer scoreTimer = new Timer(1000);
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     *
     */
    public Counter()
    {
       this.score = 0;
    }
    
    public void act() 
    {
        if(scoreTimer.checkTime()){
            addScore();
        }
        setImage(new GreenfootImage("Benis : " + score, 24, Color.BLACK, Color.YELLOW));
    }    
    
    public void addScore()
    {
        score++;
    } 
}
