import greenfoot.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MyWorld extends World
{
    public static double cash = 0; //penonzy
    public static double cps = 0; //susenka za secundu
    public static double cursor = 0.1; //cps cursoru
    public static double cp = 15; //cena za cursor
    public static double grandma = 1; //cps babki
    public static double gp = 100; //cena za babku
    public static double farm = 8; //cena za farmu
    public static double fp = 1100; //cps farmy
    public static int timer = 60;
    DecimalFormat df = new DecimalFormat("#.#");//zaokruhleni
    public MyWorld()
    {    
        super(1000, 600, 1); 
        prepare();
    }
    public void act()
    {
        timer--;
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
        addObject(new GambleBtn(), 950, 550);
        addObject(new AimBtn(), 900, 550);
        showText("Cps "+ df.format(cps), 100, 50);
        showText("Price "+ df.format(cp), 670, 67);
        showText("Price "+ df.format(gp), 670, 134);
        showText("Price "+ df.format(fp), 670, 201);
        showText("Coockies "+ df.format(cash), 100, 15);
    }
}

