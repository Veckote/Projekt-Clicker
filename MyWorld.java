import greenfoot.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MyWorld extends World
{
    DecimalFormat df = new DecimalFormat("#.#");//zaokruhleni
    public MyWorld()
    {    
        super(1000, 600, 1); 
        prepare();
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(c)){
            Greenfoot.setWorld(new Main());
        }
    }
    Coockie c = new Coockie();
    private void prepare()
    {
        showText("Welcome to coockie clicker!", 500, 50);
        showText("Its a very good clicker and a time killer", 500, 100);
        showText("You can build bildings buy upbgrades and play some mini games as:", 500, 150);
        showText("Gambling and Aim", 500, 200);
        
        addObject(c, 500, 300);
    }
}

