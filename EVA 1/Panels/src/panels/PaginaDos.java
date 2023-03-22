package panels;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;

public class PaginaDos extends JPanel{
    JLabel titulo;
    
    public PaginaDos(){
        titulo = new JLabel("Pagina dos");
        titulo.setFont(new Font("Algerian", Font.BOLD, 36));
        titulo.setForeground(new Color(255,255,255));

        this.setBackground(new Color(30, 140, 147));
        this.setSize(680,420);
        this.add(titulo, BorderLayout.CENTER);
    }
}
