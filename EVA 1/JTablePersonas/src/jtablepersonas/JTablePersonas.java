package jtablepersonas;






import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax. swing. JFrame;

import java.awt.*;
import java.awt. event. ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JTablePersonas extends JFrame{
    JTable table;
    JScrollPane scrollPanel;
    JButton btn_verconsola;
    JPanel pane_botones;
    
    DatosPersonas datos;
    
    public JTablePersonas () {
        super ("PERSONAS");

        table = new JTable();
        table.setModel( new ModeloPersonas() );
        
        table.setPreferredScrollableViewportSize( new Dimension (700,300) );
        scrollPanel = new JScrollPane( table );
        this.add(scrollPanel, BorderLayout.CENTER);
        
        pane_botones = new JPanel();
        this.add(pane_botones, BorderLayout.SOUTH);
        
        btn_verconsola = new JButton("VER DATOS EN CONSOLA");
        pane_botones.add( btn_verconsola );
        
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        datos = new DatosPersonas();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        btn_verconsola.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                datos.desplegarDatosConsola();
            }
        });
    }
    
    public static void main(String[] args){
        new JTablePersonas();
    }
}


