import greenfoot.*;
import java.text.DecimalFormat;

public class MineBuy extends Actor
{
    DecimalFormat df = new DecimalFormat("#.#");
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            if(Main.cash >= Main.mp){
                Main.cash = Main.cash - Main.mp;
                Main.mp = Main.mp * 1.2;
                Main.mpc++;
            }
        }
        getWorld().showText("Price "+ df.format(Main.mp), 670, 268);
        getWorld().showText(df.format(Main.mpc), 950, 268);
    }
}
