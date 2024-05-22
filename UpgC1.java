import greenfoot.*;

public class UpgC1 extends Actor
{
    public void act()
    {   
        int price = 100;
        if(Main.isu1 < 1){
            if(Greenfoot.mouseClicked(this)){
                if(Main.cash >= 100){
                    Main.cash = Main.cash - price;
                    Main.cursor = Main.cursor * 2;
                    Main.isu1 = 1;
                }
            }
        }
    }
}
