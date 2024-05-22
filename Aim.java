import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.text.DecimalFormat;

/**
 * Write a description of class AimTraning here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aim extends World
{
    private int timer;
    private int poc = 10;
    private double time = 0;
    Start start = new Start();
    DecimalFormat df = new DecimalFormat("#.#");
    /**
     * Constructor for objects of class AimTraning.
     * 
     */
    public Aim()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    private void prepare(){
        addObject(start, 500, 300);
        addObject(new AimC(), 500, 100);
        showText("To earn coockies you have to click all circles(as one above) as fast as posible", 500, 150);
        showText("To start press green button", 500, 350);
    }
    public void act(){
        if(Greenfoot.mouseClicked(start)){
            removeObject(start);
            for(int i=0; i<poc; i++){
                addObject(new AimC(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(600));
            }
            showText("", 500, 150);
            showText("", 500, 350);
        }
        if(getObjects(Start.class).size() == 0){
            if(getObjects(AimC.class).size() != 0){
                    time++;
            }
            else{
                    prize();
                    Greenfoot.delay(120);
                    Greenfoot.setWorld(new Main());
            }
        }
        showText("Time "+df.format(time/60), 50, 50);
        }
    private void prize(){
        double prize = Main.cash/time*100;
        showText("You won "+df.format(prize), 500, 300);
        Main.cash = Main.cash + prize;
    }
}
