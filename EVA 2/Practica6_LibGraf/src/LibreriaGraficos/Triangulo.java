package LibreriaGraficos;

import LibreriaGraficos.Figura;
import java.awt.Graphics;

public class Triangulo extends Figura{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //"los"vértices"del"triángulo"son"uno"de"xPoints"con"uno"de"yPoints
        int xPoints[] = {0, 0, getWidth()-1};
        int yPoints[] = {0, getHeight()-1, getHeight()-1};
        //g.drawPolygon(xPoints,"yPoints,"3);
        //"se"conectan"las"líneas"formando"un"polígono"y"se"rellena"al"usar"el"fill
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
