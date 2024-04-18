import greenfoot.*;

public class CursorBuy extends Actor
{
    public void act()
    {
        MyWorld w = new MyWorld();
        if(Greenfoot.mouseClicked(this)){
            if(Coockie.cash >= 10){
                w.cps++;
                Coockie.cash = Coockie.cash-10;
            }
        }
        getWorld().showText("Cps "+w.cps, 50, 50);
    }
}
