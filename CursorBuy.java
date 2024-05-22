import greenfoot.*;
import java.text.DecimalFormat;

public class CursorBuy extends Actor
{
    DecimalFormat df = new DecimalFormat("#.#");
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            if(MyWorld.cash >= MyWorld.cp){
                MyWorld.cash = MyWorld.cash - MyWorld.cp;
                MyWorld.cp = MyWorld.cp * 1.2;
                MyWorld.cursor_c++;
            }
        }
        getWorld().showText("Price "+ df.format(MyWorld.cp), 670, 67);
    }
}
