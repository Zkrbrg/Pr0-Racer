import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Code des TIMERs ist nicht von mir! Sondern von einem Kollegen!
 */
public class Timer extends Actor
{
    
    private long interval = 0;
    private long lastCheck = 0;
    

    public Timer(long _interval) 
    {
        init(_interval);
    }    
    
    public void init(long _interval){
        interval = _interval;
    }
    
    public boolean checkTime(){
        boolean result = false;
        
        long currentTime = System.currentTimeMillis();
        if(currentTime - lastCheck >= interval){
            lastCheck = currentTime;
            result = true;
        }
        return result;
    }
}
