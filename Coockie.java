import greenfoot.*; 
import java.text.DecimalFormat;

public class Coockie extends Actor
{
    public void act()
    {
        MyWorld w = new MyWorld();
        if(Greenfoot.mouseClicked(this)){
            w.cash++;
        }
        DecimalFormat df = new DecimalFormat("#.#");
    }
}
