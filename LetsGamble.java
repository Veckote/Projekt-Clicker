import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LetsGamble here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LetsGamble extends Actor
{
    /**
     * Act - do whatever the LetsGamble wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            getWorldOfType(Gamble.class).gamble();
        }
    }
}
