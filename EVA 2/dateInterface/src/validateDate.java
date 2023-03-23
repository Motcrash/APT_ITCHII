import dateLibrary.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class validateDate extends javax.swing.JFrame {
    public validateDate() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fldDay = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fldMonth = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fldYear = new javax.swing.JTextField();
        btnValidate = new javax.swing.JButton();
        sizer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lato Semibold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Validar Fecha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 27, 211, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Día");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 221, 49, -1));
        getContentPane().add(fldDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 187, 126, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mes");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 49, -1));
        getContentPane().add(fldMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 130, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Año");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 221, 49, -1));
        getContentPane().add(fldYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 130, -1));

        btnValidate.setText("Validate ");
        btnValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateActionPerformed(evt);
            }
        });
        getContentPane().add(btnValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 94, -1));
        getContentPane().add(sizer, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 470, 30, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateActionPerformed
        int d,m,y;
        
        JFrame jOp = new JFrame();
        
        d = Integer.parseInt(fldDay.getText()) ;
        m = Integer.parseInt(fldMonth.getText()) ;
        y = Integer.parseInt(fldYear.getText()) ;
        try{
            Date dte = new Date(d, m, y);
            System.out.println(dte.getDay());
            System.out.println(dte.getMonth());
            System.out.println(dte.getYear());
            JOptionPane.showMessageDialog(jOp, "Fecha válida", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JFrame f = new JFrame();   
            JOptionPane.showMessageDialog(f, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnValidateActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(validateDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(validateDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(validateDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(validateDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new validateDate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnValidate;
    private javax.swing.JTextField fldDay;
    private javax.swing.JTextField fldMonth;
    private javax.swing.JTextField fldYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel sizer;
    // End of variables declaration//GEN-END:variables
}
