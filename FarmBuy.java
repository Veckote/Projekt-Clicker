import greenfoot.*;
import java.text.DecimalFormat;

public class FarmBuy extends Actor
{
    DecimalFormat df = new DecimalFormat("#.#");
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            if(Main.cash >= Main.fp){
                Main.cps = Main.cps + Main.farm;
                Main.cash = Main.cash - Main.fp;
                Main.fp = Main.fp * 1.2;
            }
        }
        getWorld().showText("Price "+ df.format(Main.fp), 670, 201);
    }
}
