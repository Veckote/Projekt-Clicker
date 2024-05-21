import greenfoot.*;
import java.text.DecimalFormat;

public class CursorBuy extends Actor
{
    DecimalFormat df = new DecimalFormat("#.#");
    public void act()
    {
        MyWorld w = new MyWorld();
        if(Greenfoot.mouseClicked(this)){
            if(w.cash >= w.cp){
                w.cps = w.cps + w.cursor;
                w.cash = w.cash - w.cp;
                w.cp = w.cp * 1.1;
            }
        }
        getWorld().showText("Price "+ df.format(w.cp), 500, 67);
    }
}
