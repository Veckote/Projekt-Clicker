import greenfoot.*;

public class CursorBuy extends Actor
{
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            if(Coockie.cash >= 10){
                MyWorld w = new MyWorld();
                w.cpsChange(1);
            }
        }
    }
}
