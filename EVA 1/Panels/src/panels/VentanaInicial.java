package panels;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Font;


public class VentanaInicial extends JPanel{
    JLabel lblTitulo;
    VentanaInicial(){
        lblTitulo = new JLabel("Bienvenido a ...");
        lblTitulo.setFont(new Font("Algerian", Font.BOLD, 36));
        lblTitulo.setForeground(new Color(255,255,255));

        this.add(lblTitulo, BorderLayout.CENTER);
        this.setBackground(new Color(131, 152, 142));
    }
}
