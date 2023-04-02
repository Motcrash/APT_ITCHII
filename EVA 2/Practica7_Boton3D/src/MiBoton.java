import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class MiBoton extends JComponent{
    
    private int estilo = 0;
    
    public int getEstilo() {
        return estilo;
    }

    public void setEstilo(int aEsti) {
        if(aEsti == 0 || aEsti == 1){
            estilo = aEsti;
        }else estilo = 0;
    }

    @Override
    public void paint(Graphics g) {
        int r1,r2,r3;
        r1 = (int) (Math.random()*255);
        r2 = (int) (Math.random()*255);
        r3 = (int) (Math.random()*255);
        int a = getWidth()-1;
        int h = getHeight()-1;
        super.paint(g);
        g.fillRect(0,0,a,h);
        Color auxi = g.getColor();
        if(getEstilo()==0){
        g.setColor(Color.BLACK);
        g.drawLine(0,h,a,h);
        g.drawLine(a,h,a,0);
        g.setColor(Color.DARK_GRAY);
        g.drawLine(0,h-1,a-1,h-1);
        g.drawLine(a-1,h-1,a-1,0);
        g.setColor(Color.WHITE);
        g.drawLine(0,0,0,h-1);
        g.drawLine(0,0,a-1,0);
        g.setColor(Color.lightGray);
        g.drawLine(1,1,1,h-2);
        g.drawLine(1,1,a-2,1);
        }
        else{
        g.setColor(new Color(r1,r2,r3));
        g.drawLine(0,h,a,h);
        g.drawLine(a,h,a,0);
        g.setColor(Color.LIGHT_GRAY);
        g.drawLine(0,h-1,a-1,h-1);
        g.drawLine(a-1,h-1,a-1,0);
        g.setColor(Color.BLACK);
        g.drawLine(0,0,0,h-1);
        g.drawLine(0,0,h-1,0);
        g.setColor(Color.DARK_GRAY);
        g.drawLine(1,1,1,h-2);
        g.drawLine(1,1,a-2,1);
        }
        g.setColor(auxi);
    }
    
}
