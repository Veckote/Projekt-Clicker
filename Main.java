import greenfoot.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Main extends World
{
    public static double cash = 0; //penonzy
    public static double cps = 0; //susenka za secundu
    public static double cursor = 0.1; //cps cursoru
    public static double cp = 15; //cena za cursor
    public static double cpc = 0; //count cursorov
    public static double grandma = 1; //cps babki
    public static double gp = 100; //cena za babku
    public static double gpc = 0; //count babok
    public static double farm = 8; //cps farmu
    public static double fp = 1100; //cena za farmu
    public static double fpc = 0; //count farm
    public static double mp = 12000; //cena za mine
    public static double mine = 45; //cps majnu
    public static double mpc = 0; //count majn 
    public static double factp = 130000; //cena fabryky
    public static double factory = 260; //cps fabryky
    public static double factc = 0;
    public static int timer = 60;
    public static double click = 1; //click money
    //upgs
    public static int isu1 = 0;//1cursor upg check
    public static int isu2 = 0;//1cursor upg check
    public static int isu1_1 = 0;//1click upg check
    public static int isu1_2 = 0;//1click upg check
    DecimalFormat df = new DecimalFormat("#.#");//zaokruhleni

    private int chance = 1;
    private int timer1 = 60; //cas zivotu gloden nigga
    private int timerEff = 4620;
    public Main()
    {    
        super(1000, 600, 1); 
        prepare();
    }

    public void act()
    {
        timer--;
        cps = cursor*cpc + grandma*gpc + farm*fpc + mine*mpc + factory*factc;
        if (timer <= 0){
            timer = 60;
            cash = cash + cps;
        }
        showText("Cps "+ df.format(cps), 100, 50);
        showText("Coockies "+ df.format(cash), 100, 15);
        goldenCookie();
    }

    public void goldenCookie()
    {
        if(Greenfoot.getRandomNumber(100) == chance)
        {
            addObject(new Goldencookie(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(600));
        }
    }

    private void prepare()
    {
        addObject(new Coockie(), 100, 300);
        addObject(new CursorBuy(), 850, 67);
        addObject(new GrandmaBuy(), 850, 134);
        addObject(new FarmBuy(), 850, 201);
        addObject(new MineBuy(), 850, 268);
        addObject(new FactoryBuy(), 850, 335);
        addObject(new GambleBtn(), 950, 550);
        addObject(new AimBtn(), 900, 550);
        showText("Cps "+ df.format(cps), 100, 50);
        showText("Price "+ df.format(cp), 670, 67);
        showText("Price "+ df.format(gp), 670, 134);
        showText("Price "+ df.format(fp), 670, 201);
        showText("Price "+ df.format(mp), 670, 268);
        showText("Price "+ df.format(factp), 670, 335);
        showText("Coockies "+ df.format(cash), 100, 15);
        Upg upg = new Upg();
        addObject(upg,42,560);
    }
    public void buff(){
        cps = cps * 7;
    }
    public void debuff(){
        cps = cps / 7;
    }
}

