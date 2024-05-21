import greenfoot.*;
import java.text.DecimalFormat;

public class GrandmaBuy extends Actor
{
    DecimalFormat df = new DecimalFormat("#.#");
    public void act()
    {
        MyWorld w = new MyWorld();
        if(Greenfoot.mouseClicked(this)){
            if(w.cash >= w.gp){
                w.cps = w.cps + w.grandma;
                w.cash = w.cash - w.gp;
                w.gp = w.gp * 1.1;
            }
        }
        getWorld().showText("Price "+ df.format(w.gp), 500, 134);
    }
}
