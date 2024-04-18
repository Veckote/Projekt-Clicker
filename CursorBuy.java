import greenfoot.*;

public class CursorBuy extends Actor
{
    public void act()
    {
        MyWorld w = new MyWorld();
        if(Greenfoot.mouseClicked(this)){
            if(Coockie.cash >= w.cp){
                w.cps = w.cps + 1;
                Coockie.cash = Coockie.cash - 10;
                w.cp = w.cp * 1.2;
            }
        }
        
    }
}
