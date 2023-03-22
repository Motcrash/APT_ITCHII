package formulageneral;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;

public class formuGralScreen extends javax.swing.JFrame {
    // <!-- Variables -->
    JLabel lblExampleCuadratic, lblExampleLinear, lblExampleConstant;
    JLabel lblCuadratic, lblLinear, lblConstant;
    JLabel lblTitle, lblX1, lblX2;
    JLabel lblResult1, lblResult2;
    JTextField fldCuadratic, fldLinear, fldConstant;
    JButton btnAccept, btnClear, btnClose;
    // <!-- Variables -->

    public formuGralScreen() {
        
        // <!-- Components -->
        initComponents();
        this.setBounds(100, 100, 700, 600);
        this.setVisible(true);
        
        lblTitle = new JLabel("Fórmula general");
        lblExampleCuadratic = new JLabel("ax^2 +");
        lblExampleLinear = new JLabel("bx + ");
        lblExampleConstant = new JLabel("c");
        lblCuadratic = new JLabel("Termino cuadratico");
        lblLinear = new JLabel("Termino lineal");
        lblConstant = new JLabel("Constante");
        lblX1 = new JLabel("X_1 = ");
        lblX2 = new JLabel("X_2 = ");
        lblResult1 = new JLabel("");
        lblResult2 = new JLabel("");
        
        fldCuadratic = new JTextField(10);
        fldLinear = new JTextField(10);
        fldConstant = new JTextField(10);
        
        btnAccept = new JButton("Aceptar");
        btnClear = new JButton("Limpiar");
        btnClose = new JButton("Cerrar");
        // <!-- Components -->
        
        // <!-- Add-ons -->
        this.add(lblTitle);
        this.add(lblExampleCuadratic);
        this.add(lblExampleLinear);
        this.add(lblExampleConstant);
        this.add(lblCuadratic); 
        this.add(lblLinear);
        this.add(lblConstant);
        this.add(lblX1);
        this.add(lblX2);
        this.add(lblResult1);
        this.add(lblResult2);
        this.add(fldCuadratic);
        this.add(fldLinear);
        this.add(fldConstant);
        this.add(btnAccept);
        this.add(btnClear);
        this.add(btnClose);
        // <!-- Add-ons -->
        
        // <!-- Labels -->
        lblTitle.setBounds(275,25,200,50);
        lblTitle.setFont(new FontUIResource("Verdana", FontUIResource.PLAIN, 20));

        lblExampleCuadratic.setBounds(290,75,55,50);
        lblExampleCuadratic.setFont(new FontUIResource("Serif", FontUIResource.PLAIN, 20));

        lblExampleLinear.setBounds(345,75,45,50);
        lblExampleLinear.setFont(new FontUIResource("Serif", FontUIResource.PLAIN, 20));

        lblExampleConstant.setBounds(390,75,12,50);
        lblExampleConstant.setFont(new FontUIResource("Serif", FontUIResource.PLAIN, 20));
        // <!-- Labels -->

        // <!-- Fields -->
        lblCuadratic.setBounds(200,136,150,50);
        lblCuadratic.setFont(new FontUIResource("Apple Casual", FontUIResource.PLAIN, 15));
        fldCuadratic.setBounds(400,152,100,25);
        
        lblLinear.setBounds(200,186,150,50);
        lblLinear.setFont(new FontUIResource("Apple Casual", FontUIResource.PLAIN, 15));
        fldLinear.setBounds(400,200,100,25);

        lblConstant.setBounds(202,236,150,50);
        lblConstant.setFont(new FontUIResource("Apple Casual", FontUIResource.PLAIN, 15));
        fldConstant.setBounds(400,250,100,25);

        lblX1.setBounds(225, 310, 100, 50);
        lblX2.setBounds(400, 310, 100, 50);

        lblResult1.setBounds(260, 310, 100, 50);
        lblResult1.setFont(new FontUIResource("Apple Casual", FontUIResource.PLAIN, 15));
        lblResult2.setBounds(438, 310, 100, 50);
        lblResult2.setFont(new FontUIResource("Apple Casual", FontUIResource.PLAIN, 15));
        // <!-- Fields -->
        

        // <!-- Buttons -->
        btnAccept.setBounds(150,400,100,50);    
        btnClear.setBounds(325,400,100,50);
        btnClose.setBounds(500,400,100,50);
        // <!-- Buttons -->
        
        // <!-- FocusListeners -->
        fldCuadratic.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                lblExampleCuadratic.setBackground(Color.GRAY);
                lblExampleCuadratic.setOpaque(true);
            }

            @Override
            public void focusLost(FocusEvent e) {
                lblExampleCuadratic.setBackground(new Color(238, 238, 238));
                lblExampleCuadratic.setOpaque(true);
            }
            
        });

        fldLinear.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                lblExampleLinear.setBackground(Color.GRAY);
                lblExampleLinear.setOpaque(true);
            }

            @Override
            public void focusLost(FocusEvent e) {
                lblExampleLinear.setBackground(new Color(238, 238, 238));
                lblExampleLinear.setOpaque(true);
            }
            
        });

        fldConstant.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                lblExampleConstant.setBackground(Color.GRAY);
                lblExampleConstant.setOpaque(true);

                fldConstant.setForeground(Color.RED);
            }

            @Override
            public void focusLost(FocusEvent e) {
                lblExampleConstant.setBackground(new Color(238, 238, 238));
                lblExampleConstant.setOpaque(true);
            }
            
        });
        // <!-- FocusListeners -->

        // <!-- ActionListeners -->
        btnAccept.addActionListener(new ActionListener(){
            @Override
            
            public void actionPerformed(ActionEvent e){
                double a = Integer.parseInt(fldCuadratic.getText()); 
                double b = Integer.parseInt(fldLinear.getText()); 
                double c = Integer.parseInt(fldConstant.getText()); 
                FormulaGralClass flaGral = new FormulaGralClass(a, b, c);

                lblResult1.setText(Double.toString(flaGral.solSum()));
                lblResult2.setText(Double.toString(flaGral.solRes()));
            }
        });

        btnClear.addActionListener(new ActionListener(){
            @Override
            
        public void actionPerformed(ActionEvent e){
            fldCuadratic.setText("");
            fldLinear.setText("");
            fldConstant.setText("");

            lblResult1.setText("");
            lblResult2.setText("");
        }
        });
        
        btnClose.addActionListener(new ActionListener(){
            @Override
            
        public void actionPerformed(ActionEvent e){
            formuGralScreen.this.dispose();
        }
        });
        // <!-- ActionListeners -->
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formuGralScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formuGralScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formuGralScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formuGralScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
