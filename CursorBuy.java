import greenfoot.*;

public class CursorBuy extends Actor
{
    public double cursorincome = 0;
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            if(Coockie.cash >= 10){
                cursorincome = cursorincome + 0.1;
            }
        }
    }
}
