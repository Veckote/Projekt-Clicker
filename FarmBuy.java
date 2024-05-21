import greenfoot.*;
import java.text.DecimalFormat;

public class FarmBuy extends Actor
{
    DecimalFormat df = new DecimalFormat("#.#");
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            if(MyWorld.cash >= MyWorld.fp){
                MyWorld.cps = MyWorld.cps + MyWorld.farm;
                MyWorld.cash = MyWorld.cash - MyWorld.fp;
                MyWorld.fp = MyWorld.fp * 1.1;
            }
        }
        getWorld().showText("Price "+ df.format(MyWorld.fp), 500, 201);
    }
}
