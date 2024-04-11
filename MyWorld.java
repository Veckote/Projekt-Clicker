import greenfoot.*;

public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 400, 1); 
        prepare();
    }

    public void act()
    {

    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Coockie(), 300, 200);
    }
}
