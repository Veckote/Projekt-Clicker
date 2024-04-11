import greenfoot.*; 

public class Coockie extends Actor
{
    public int cash = 01;
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            cash++;
        }
        getWorld().showText("Coockies "+cash, 50, 15);
    }
}
