package panels;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panels extends JFrame{
    JPanel contenedorApp, contenedorBotones, contenedorVentanas;
    JButton btnPagina1, btnPagina2;
    public Panels(){
        this.setSize(720, 480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnPagina1 = new JButton("Pagina uno");
        btnPagina1.setSize(200,40);
        btnPagina1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVentana(new PaginaUno());
            }
        });

        btnPagina2 = new JButton("Pagina dos");
        btnPagina2.setSize(200,40);
        btnPagina2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVentana(new PaginaDos());
            }
        });

        contenedorBotones = new JPanel();
        contenedorBotones.setBackground(new Color(0,72,83));
        contenedorBotones.setLayout(new FlowLayout(FlowLayout.CENTER));
        contenedorBotones.add(btnPagina1);
        contenedorBotones.add(btnPagina2);

        contenedorVentanas = new JPanel();
        contenedorVentanas.setBackground(new Color(72, 88, 111));
        contenedorVentanas.setLayout(new BorderLayout());

        mostrarVentana(new VentanaInicial());

        contenedorApp = new JPanel();
        contenedorApp.setBackground(new Color(72, 88, 111));
        contenedorApp.setLayout(new BorderLayout());
        contenedorApp.add(contenedorBotones, BorderLayout.NORTH);
        contenedorApp.add(contenedorVentanas, BorderLayout.CENTER);

        this.setLayout(new BorderLayout());
        this.add(contenedorApp, BorderLayout.CENTER);
    }

    private void mostrarVentana(JPanel ventana) {
       
        ventana.setLocation(0,0);

        contenedorVentanas.removeAll();
        contenedorVentanas.add(ventana, BorderLayout.CENTER);
        contenedorVentanas.revalidate();
        contenedorVentanas.repaint();
    }
    public static void main(String[] args) {
        new Panels().setVisible(true);
    }
    
}
