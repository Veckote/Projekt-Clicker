import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Goldencookie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goldencookie extends Actor
{
    /**
     * Act - do whatever the Goldencookie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int chance = 1;
    public int timer = 100;
    
    public void act()
    {
        timer--;
        if(timer == 0){
            getWorld().removeObject(this);
        }
        if(Greenfoot.mouseClicked(this)){
            Main.cash = Main.cash + Main.cps*77;
        }
    }
}
