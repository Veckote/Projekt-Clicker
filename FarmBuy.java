import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.text.DecimalFormat;

/**
 * Write a description of class FarmBuy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FarmBuy extends Actor
{
    DecimalFormat df = new DecimalFormat("#.#");
    /**
     * Act - do whatever the FarmBuy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MyWorld w = new MyWorld();
        if(Greenfoot.mouseClicked(this)){
            if(Coockie.cash >= w.fp){
                w.cps = w.cps + w.farm;
                Coockie.cash = Coockie.cash - w.fp;
                w.fp = w.fp * 1.1;
            }
        }
        getWorld().showText("Price "+ df.format(w.fp), 500, 201);
    }
}
