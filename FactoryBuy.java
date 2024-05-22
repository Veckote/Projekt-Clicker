import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.text.DecimalFormat;

/**
 * Write a description of class FactoryBuy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FactoryBuy extends Actor
{
    /**
     * Act - do whatever the FactoryBuy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    DecimalFormat df = new DecimalFormat("#.#");
    if(Greenfoot.mouseClicked(this)){
           if(Main.cash >= Main.factp){
               Main.cash = Main.cash - Main.factp;
               Main.factp = Main.factp * 1.2;
               Main.factc++;
            }
        }
    getWorld().showText("Price "+ df.format(Main.factp), 670, 335);
    getWorld().showText(df.format(Main.factc), 950, 335);
    }
}
