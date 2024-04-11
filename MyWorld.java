import greenfoot.*;

public class MyWorld extends World
{
    public MyWorld()
    {    
        super(1000, 600, 1); 
        prepare();
    }
    public int cps;
    public void act()
    {

    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Coockie(), 100, 300);
        addObject(new CursorBuy(), 850, 50);
    }
    public void cpsChange(int how){
        cps = cps+how;
    }

}
