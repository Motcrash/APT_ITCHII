package LibreriaGraficos;

import LibreriaGraficos.Figura;
import java.awt.Color;
import java.awt.Graphics;

public class Rectangulo extends Figura {
    @Override
    public void paint(Graphics g){
        super.paint(g);
        //g.drawRect(0,"0,"getWidth()D1,"getHeight()D1);
        g.fillRect(0,0, getWidth()-1, getHeight()-1);
    }
}