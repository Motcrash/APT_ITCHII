package LibreriaGraficos;
import java.awt.Graphics;

public class Circulo extends Figura{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int d= getWidth()-1;
        if (getHeight() < getWidth())//+pregunta+la+dimension+menor+
            d = getHeight()-1;
        //g.drawOval(0,++0,d,+d);
        g.fillOval(0,0,d,d);
    }
}