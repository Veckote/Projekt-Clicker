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
    public static int timer = 60;
    DecimalFormat df = new DecimalFormat("#.#");//zaokruhleni
    public Main()
    {    
        super(1000, 600, 1); 
        prepare();
    }
    public void act()
    {
        timer--;
        cps = cursor*cpc + grandma*gpc + farm*fpc + mine*mpc;
        if (timer <= 0){
            timer = 60;
            cash = cash + cps;
        }
        showText("Cps "+ df.format(cps), 100, 50);
        showText("Coockies "+ df.format(cash), 100, 15);
    }
    
    private void prepare()
    {
        addObject(new Coockie(), 100, 300);
        addObject(new CursorBuy(), 850, 67);
        addObject(new GrandmaBuy(), 850, 134);
        addObject(new FarmBuy(), 850, 201);
        addObject(new MineBuy(), 850, 268);
        addObject(new GambleBtn(), 950, 550);
        addObject(new AimBtn(), 900, 550);
        showText("Cps "+ df.format(cps), 100, 50);
        showText("Price "+ df.format(cp), 670, 67);
        showText("Price "+ df.format(gp), 670, 134);
        showText("Price "+ df.format(fp), 670, 201);
        showText("Price "+ df.format(mp), 670, 268);
        showText("Coockies "+ df.format(cash), 100, 15);
        Upg upg = new Upg();
        addObject(upg,42,560);
    }
}

