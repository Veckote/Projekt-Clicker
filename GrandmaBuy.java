import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.text.DecimalFormat;
public class GrandmaBuy extends Actor
{
    DecimalFormat df = new DecimalFormat("#.#");
    public void act()
    {
        MyWorld w = new MyWorld();
        if(Greenfoot.mouseClicked(this)){
            if(Coockie.cash >= w.gp){
                w.cps = w.cps + w.grandma;
                Coockie.cash = Coockie.cash - w.gp;
                w.gp = w.gp * 1.2;
            }
        }
        getWorld().showText("Price "+ df.format(w.gp), 500, 134);
    }
}
