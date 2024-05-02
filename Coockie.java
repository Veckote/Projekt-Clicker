import greenfoot.*; 
import java.text.DecimalFormat;

public class Coockie extends Actor
{
    public static double cash = 0;
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            cash++;
        }
        DecimalFormat df = new DecimalFormat("#.#");
        getWorld().showText("Coockies "+ df.format(cash), 50, 15);
    }
    public void coockie(double how){

        cash = cash+how;
        
        
    }
}
