import greenfoot.*;
import java.text.DecimalFormat;

public class MineBuy extends Actor
{
    DecimalFormat df = new DecimalFormat("#.#");
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            if(Main.cash >= Main.mp){
                Main.cps = Main.cps + Main.mine;
                Main.cash = Main.cash - Main.mp;
                Main.mp = Main.mp * 1.2;
            }
        }
        getWorld().showText("Price "+ df.format(Main.mp), 670, 268);
    }
}
