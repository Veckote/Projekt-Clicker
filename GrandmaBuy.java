import greenfoot.*;
import java.text.DecimalFormat;

public class GrandmaBuy extends Actor
{
    DecimalFormat df = new DecimalFormat("#.#");
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            if(MyWorld.cash >= MyWorld.gp){
                MyWorld.cps = MyWorld.cps + MyWorld.grandma;
                MyWorld.cash = MyWorld.cash - MyWorld.gp;
                MyWorld.gp = MyWorld.gp * 1.1;
            }
        }
        getWorld().showText("Price "+ df.format(MyWorld.gp), 670, 134);
    }
}
