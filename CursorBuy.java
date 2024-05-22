import greenfoot.*;
import java.text.DecimalFormat;

public class CursorBuy extends Actor
{
    DecimalFormat df = new DecimalFormat("#.#");
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            if(Main.cash >= Main.cp){
                Main.cps = Main.cps + Main.cursor;
                Main.cash = Main.cash - Main.cp;
                Main.cp = Main.cp * 1.2;
            }
        }
        getWorld().showText("Price "+ df.format(Main.cp), 670, 67);
    }
}
