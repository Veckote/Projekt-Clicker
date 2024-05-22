import greenfoot.*;

public class UpgCl1 extends Actor
{
    public void act()
    {   
        int price = 200;
        if(Main.isu1_1 < 1){
            if(Greenfoot.mouseClicked(this)){
                if(Main.cash >= 200){
                    Main.cash = Main.cash - price;
                    Main.click = Main.click * 2;
                    Main.isu1_1 = 1;
                }
            }
        }
    }
}
