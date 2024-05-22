import greenfoot.*;
import java.text.DecimalFormat;

public class FarmBuy extends Actor
{
    DecimalFormat df = new DecimalFormat("#.#");
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            if(Main.cash >= Main.fp){
                Main.cash = Main.cash - Main.fp;
                Main.fp = Main.fp * 1.2;
                Main.fpc++;
            }
        }
        getWorld().showText("Price "+ df.format(Main.fp), 670, 201);
    }
}
