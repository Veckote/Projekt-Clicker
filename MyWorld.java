import greenfoot.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MyWorld extends World
{
    
    public static double cps = 0; //susenka za secundu
    public static double cursor = 0.1; //cps cursoru
    public static double cp = 10; //cena za cursor
    public static double grandma = 10; //cps babki
    public static double gp = 100; //cena za babku
    public int timer = 60;
    DecimalFormat df = new DecimalFormat("#.#");
    public MyWorld()
    {    
        super(1000, 600, 1); 
        prepare();
    }
    public void act()
    {
        Coockie c = new Coockie();
        timer--;
        if (timer <= 0){
            timer = 60;
            c.cash = c.cash + cps;
        }
        showText("Cps "+ df.format(cps), 100, 50);
    }
    private void prepare()
    {
        addObject(new Coockie(), 100, 300);
        addObject(new CursorBuy(), 850, 67);
        addObject(new GrandmaBuy(), 850, 134);
        showText("Cps "+ df.format(cps), 100, 50);
        showText("Price "+ df.format(cp), 500, 67);
        showText("Price "+ df.format(gp), 500, 134);
        showText("Coockies "+ 0, 100, 15);
    }
}

