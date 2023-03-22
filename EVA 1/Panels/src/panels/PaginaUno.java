package panels;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaginaUno extends JPanel{
    JLabel titulo;

    JButton holaMundo;
    
    public PaginaUno(){
        titulo = new JLabel("Pagina uno");
        titulo.setFont(new Font("Algerian", Font.BOLD, 36));
        titulo.setForeground(new Color(255,255,255));

        holaMundo = new JButton("Pagina uno");
        holaMundo.setSize(200,40);
        holaMundo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola mundo");
            }
        });

        this.setBackground(new Color(72, 88, 111));
        this.setSize(680,420);
        this.add(titulo, BorderLayout.CENTER);
        this.add(holaMundo, BorderLayout.SOUTH);
    }
}
