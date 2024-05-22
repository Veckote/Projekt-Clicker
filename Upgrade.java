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
        addObject(upgC1,30,29);
    }
}
