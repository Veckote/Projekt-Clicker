import greenfoot.*;

public class UpgCl2 extends Actor
{
    public void act()
    {   
        int price = 750;
        if(Main.isu1_2 < 1){
            if(Greenfoot.mouseClicked(this)){
                if(Main.cash >= 750){
                    Main.cash = Main.cash - price;
                    Main.click = Main.click * 2;
                    Main.isu1_2 = 1;
                }
            }
        }
    }
}
