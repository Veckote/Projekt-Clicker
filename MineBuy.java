import greenfoot.*;
import java.text.DecimalFormat;

public class MineBuy extends Actor
{
    DecimalFormat df = new DecimalFormat("#.#");
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            if(MyWorld.cash >= MyWorld.mp){
                MyWorld.cps = MyWorld.cps + MyWorld.mine;
                MyWorld.cash = MyWorld.cash - MyWorld.mp;
                MyWorld.mp = MyWorld.mp * 1.2;
            }
        }
        getWorld().showText("Price "+ df.format(MyWorld.mp), 670, 268);
    }
}
