import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.text.DecimalFormat;

/**
 * Write a description of class Gamble here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gamble extends World
{
    DecimalFormat df = new DecimalFormat("#.#");
    private double bet;
    private int betNum = 1;
    private int num;
    /**
     * Constructor for objects of class Gamble.
     * 
     */
    public Gamble()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    private void prepare(){
        addObject(new BackBtn(), 950, 550);
        addObject(new LetsGamble(), 500, 300);
        showText("To play you chouse a bet by clicking up and down buttnos, and a nuber whith w and s buttons, ", 500, 500);
        showText("than you press yellow buttnon. To go back press back button", 500, 550);
    }
    public void act(){
        showText("Cps "+ df.format(Main.cps), 100, 50);
        showText("Coockies "+ df.format(Main.cash), 100, 15);
        showText("Bet cash "+ df.format(bet), 500, 250);
        showText("Prediction "+ betNum, 300, 300);
        showText("Number "+ num, 700, 300);
        Main.timer--;
        if (Main.timer <= 0){
            Main.timer = 60;
            Main.cash = Main.cash + Main.cps;
        }
        if(Greenfoot.isKeyDown("up")){
            bet++;
            if(bet > Main.cash){
                bet = Main.cash;
            }
        }
        if(Greenfoot.isKeyDown("down")){
            if(bet > 0){
                bet--;
            }
            else{
                bet = 0;
            }
        }
        String kl = Greenfoot.getKey();
        if("w".equals(kl)){
            betNum++;
            if(betNum > 5){
                betNum = 5;
            }
        }
        if("s".equals(kl)){
            if(betNum > 0){
                betNum--;
            }
        }
    }
    public void gamble(){
        if(Main.cash > bet){
            num = Greenfoot.getRandomNumber(5);
            if(num == betNum){
                Main.cash = Main.cash + bet;
                showText("You Won "+df.format(bet)+" coockies", 500, 100);
            }
            else{
                Main.cash = Main.cash - bet;
                showText("You Lost "+df.format(bet)+" coockies", 500, 100);
            }
        }
        else{
            showText("You dont have enought coockies", 500, 100);
        }
    }
}
