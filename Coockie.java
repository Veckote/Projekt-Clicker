import greenfoot.*; 

public class Coockie extends Actor
{
    public int cash = 0;
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            cash++;
        }
        
    }
}
