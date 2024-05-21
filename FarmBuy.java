import greenfoot.*;
import java.text.DecimalFormat;

public class FarmBuy extends Actor
{
    DecimalFormat df = new DecimalFormat("#.#");
    public void act()
    {
        MyWorld w = new MyWorld();
        if(Greenfoot.mouseClicked(this)){
            if(w.cash >= w.fp){
                w.cps = w.cps + w.farm;
                w.cash = w.cash - w.fp;
                w.fp = w.fp * 1.1;
            }
        }
        getWorld().showText("Price "+ df.format(w.fp), 500, 201);
    }
}
