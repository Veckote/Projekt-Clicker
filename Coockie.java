import greenfoot.*; 

public class Coockie extends Actor
{
    public static double cash = 0;
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            cash++;
        }
        getWorld().showText("Coockies "+ cash, 50, 15);
    }
    public void coockie(double how){
        cash = cash+how;
    }
}
