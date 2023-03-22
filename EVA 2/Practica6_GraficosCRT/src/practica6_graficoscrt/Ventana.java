package practica6_graficoscrt;

import LibreriaGraficos.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
public class Ventana extends javax.swing.JFrame {

    Random rand;
    int x = 0, y;
    public Ventana(){
        initComponents();
        rand = new Random();
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        
        jpnDibujo.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
            
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnDibujo = new javax.swing.JPanel();
        jpnBotones = new javax.swing.JPanel();
        jbtRectangulo = new javax.swing.JButton();
        jbtCirculo = new javax.swing.JButton();
        jbtTriangulo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 360));
        setMinimumSize(new java.awt.Dimension(720, 360));

        jpnDibujo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jpnDibujo.setMaximumSize(new java.awt.Dimension(100, 100));
        jpnDibujo.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jpnDibujoLayout = new javax.swing.GroupLayout(jpnDibujo);
        jpnDibujo.setLayout(jpnDibujoLayout);
        jpnDibujoLayout.setHorizontalGroup(
            jpnDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnDibujoLayout.setVerticalGroup(
            jpnDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        getContentPane().add(jpnDibujo, java.awt.BorderLayout.CENTER);

        jbtRectangulo.setText("Rectángulo");
        jbtRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRectanguloActionPerformed(evt);
            }
        });

        jbtCirculo.setText("Círculo");
        jbtCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCirculoActionPerformed(evt);
            }
        });

        jbtTriangulo.setText("Triángulo");
        jbtTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTrianguloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnBotonesLayout = new javax.swing.GroupLayout(jpnBotones);
        jpnBotones.setLayout(jpnBotonesLayout);
        jpnBotonesLayout.setHorizontalGroup(
            jpnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBotonesLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jbtRectangulo)
                .addGap(151, 151, 151)
                .addComponent(jbtCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(jbtTriangulo)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jpnBotonesLayout.setVerticalGroup(
            jpnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBotonesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtRectangulo)
                    .addComponent(jbtCirculo)
                    .addComponent(jbtTriangulo))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        getContentPane().add(jpnBotones, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTrianguloActionPerformed
        Triangulo trian = new Triangulo();
        trian.setSize(50,50);
        trian.setLocation(x,y);
        jpnDibujo.add(trian);
        jpnDibujo.repaint();
    }//GEN-LAST:event_jbtTrianguloActionPerformed

    private void jbtCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCirculoActionPerformed
        Circulo circu = new Circulo();
        circu.setSize(50,50);
        circu.setLocation(x,y);
        jpnDibujo.add(circu);
        jpnDibujo.repaint();
    }//GEN-LAST:event_jbtCirculoActionPerformed

    private void jbtRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRectanguloActionPerformed
        Rectangulo rect = new Rectangulo();
        rect.setSize(50,60);
        rect.setLocation(x,y);
        jpnDibujo.add(rect);
        jpnDibujo.repaint();
    }//GEN-LAST:event_jbtRectanguloActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtCirculo;
    private javax.swing.JButton jbtRectangulo;
    private javax.swing.JButton jbtTriangulo;
    private javax.swing.JPanel jpnBotones;
    private javax.swing.JPanel jpnDibujo;
    // End of variables declaration//GEN-END:variables
}
