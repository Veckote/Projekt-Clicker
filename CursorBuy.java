import greenfoot.*;

public class CursorBuy extends Actor
{
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
        
    }
}
