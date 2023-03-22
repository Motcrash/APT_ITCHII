package recta;

import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel{
    private JLabel lblTitle;

    public Menu() {
        lblTitle = new JLabel("Calcular la distancia de una recta");

        lblTitle.setFont(new Font("Verdana", Font.BOLD, 36));
        lblTitle.setForeground(Color.white);
        lblTitle.setOpaque(true);
        lblTitle.setBackground( new Color(131, 152, 142) );
        lblTitle.setBorder(BorderFactory.createEmptyBorder(90, 150, 90, 150));
        lblTitle.setLocation(0, 0);
        this.add(lblTitle);
        this.setBorder(BorderFactory.createEmptyBorder(90, 150, 90, 150));
        this.setBackground( new Color(131, 152, 142));
    }
}
