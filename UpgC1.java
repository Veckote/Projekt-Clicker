import greenfoot.*;

public class UpgC1 extends Actor
{
    public void act()
    {
        int price = 100;
        if(Greenfoot.mouseClicked(this)){
            if(Main.cash >= Main.cp){
                Main.cash = Main.cash - price;
                Main.cursor = Main.cursor * 2;
            }
        }
    }
}
