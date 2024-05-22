import greenfoot.*;
import java.text.DecimalFormat;

public class GrandmaBuy extends Actor
{
    DecimalFormat df = new DecimalFormat("#.#");
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            if(Main.cash >= Main.gp){
                Main.cps = Main.cps + Main.grandma;
                Main.cash = Main.cash - Main.gp;
                Main.gp = Main.gp * 1.2;
            }
        }
        getWorld().showText("Price "+ df.format(Main.gp), 670, 134);
    }
}
