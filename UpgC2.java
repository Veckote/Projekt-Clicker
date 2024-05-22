import greenfoot.*;

public class UpgC2 extends Actor
{
    public void act()
    {   
        int price = 500;
        if(Main.isu2 < 1){
            if(Greenfoot.mouseClicked(this)){
                if(Main.cash >= Main.cp){
                    Main.cash = Main.cash - price;
                    Main.cursor = Main.cursor * 2;
                    Main.isu2 = 1;
                }
            }
        }
    }
}