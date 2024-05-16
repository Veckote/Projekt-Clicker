import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.text.DecimalFormat;
/**
 * Write a description of class GrandmaBuy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GrandmaBuy extends Actor
{
    /**
     * Act - do whatever the GrandmaBuy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int price = 100;
    DecimalFormat df = new DecimalFormat("#.#");
    public void act()
    {
        MyWorld w = new MyWorld();
        if(Greenfoot.mouseClicked(this)){
            if(Coockie.cash >= w.cp){
                w.cps = w.cps + w.grandma;
                Coockie.cash = Coockie.cash - w.gp;
                w.gp = w.gp * 1.2;
            }
        }
        getWorld().showText("Price "+ df.format(w.gp), 500, 134);
    }
}
