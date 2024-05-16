import greenfoot.*;
import java.text.DecimalFormat;
public class CursorBuy extends Actor
{
    DecimalFormat df = new DecimalFormat("#.#");
    public void act()
    {
        MyWorld w = new MyWorld();
        if(Greenfoot.mouseClicked(this)){
            if(Coockie.cash >= w.cp){
                w.cps = w.cps + w.cursor;
                Coockie.cash = Coockie.cash - w.cp;
                w.cp = w.cp * 1.2;
            }
        }
        getWorld().showText("Price "+ df.format(w.cp), 500, 67);
    }
}
