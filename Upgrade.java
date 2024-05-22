import greenfoot.*;
import java.text.DecimalFormat;

public class Upgrade extends World
{
    public Upgrade()
    {    
        super(1000, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BackBtn backBtn = new BackBtn();
        addObject(backBtn,950,550);
        UpgC1 upgC1 = new UpgC1();
        addObject(upgC1,70,30);
        showText("100, Cursor x2 ", 70, 55);
        UpgC2 upgC2 = new UpgC2();
        addObject(upgC2,210,30);
        showText("500, Cursor x2 ", 210, 55);
        UpgCl1 upgCl1 = new UpgCl1();
        addObject(upgCl1,70,120);
        showText("200, Click x2 ", 70, 150);
        UpgCl2 upgCl2 = new UpgCl2();
        addObject(upgCl2,210,120);
        showText("750, Click x2 ", 210, 150);
    }

    public void act()
    {
        if (Main.isu1 == 1)
        {
            showText("Bought:"+ "Yes", 70, 80);
        }
        else
        {
            showText("Bought:"+ "No", 70, 80);    
        }
        if (Main.isu2 == 1)
        {
            showText("Bought:"+ "Yes", 210, 80);
        }
        else
        {
            showText("Bought:"+ "No", 210, 80);    
        }
        if (Main.isu1_1 == 1)
        {
            showText("Bought:"+ "Yes", 70, 175);
        }
        else
        {
            showText("Bought:"+ "No", 70, 175);    
        }
        if (Main.isu1_2 == 1)
        {
            showText("Bought:"+ "Yes", 210, 175);
        }
        else
        {
            showText("Bought:"+ "No", 210, 175);    
        }
        
        Main.timer--;
        Main.cps = Main.cursor*Main.cpc + Main.grandma*Main.gpc + Main.farm*Main.fpc + Main.mine*Main.mpc;
        if (Main.timer <= 0){
            Main.timer = 60;
            Main.cash = Main.cash + Main.cps;
        }
    }
}
