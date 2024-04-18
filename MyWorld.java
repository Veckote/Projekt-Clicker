import greenfoot.*;

public class MyWorld extends World
{
    public static double cps = 0;
    public static double cp = 10;
    public MyWorld()
    {    
        super(1000, 600, 1); 
        prepare();
    }
    public void act()
    {
        Coockie c = new Coockie();
        c.coockie(cps);
        showText("Cps "+ cps, 50, 50);
        showText("Price "+ cp, 500, 50);
    }
    private void prepare()
    {
        addObject(new Coockie(), 100, 300);
        addObject(new CursorBuy(), 850, 50);
        showText("Cps "+ cps, 50, 50);
        showText("Price "+ cp, 500, 50);
    }
}

