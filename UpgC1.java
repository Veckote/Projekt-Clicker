import greenfoot.*;

public class UpgC1 extends Actor
{
    public void act()
    {
        int price = 100;
        if(Greenfoot.mouseClicked(this)){
            if(MyWorld.cash >= MyWorld.cp){
                MyWorld.cash = MyWorld.cash - price;
                MyWorld.cursor = MyWorld.cursor * 2;
            }
        }
    }
}
