/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface;

public class MiNombre extends javax.swing.JPanel implements java.beans.Customizer{
    private Object bean;
    public MiNombre() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbName = new javax.swing.JLabel();
        jlbNombre = new javax.swing.JLabel();
        jlbApePat = new javax.swing.JLabel();
        jlbAoeMat = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfApeMat = new javax.swing.JTextField();
        jtfApePat = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbName.setText("Name:");
        add(jlbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, 50, -1));

        jlbNombre.setText("Nombre");
        add(jlbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, -1));

        jlbApePat.setText("Apellido P.");
        add(jlbApePat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jlbAoeMat.setText("Apellido M.");
        add(jlbAoeMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });
        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
            }
        });
        add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 140, -1));

        jtfApeMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApeMatKeyTyped(evt);
            }
        });
        add(jtfApeMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 140, -1));

        jtfApePat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApePatKeyTyped(evt);
            }
        });
        add(jtfApePat, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
        jlbName.setText("Name: " + jtfNombre.getText() + "  " + jtfApePat.getText() + "  "+ jtfApeMat.getText());
    }//GEN-LAST:event_jtfNombreKeyTyped

    private void jtfApePatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApePatKeyTyped
        jlbName.setText("Name: " + jtfNombre.getText() + "  " + jtfApePat.getText() + "  "+ jtfApeMat.getText());
    }//GEN-LAST:event_jtfApePatKeyTyped

    private void jtfApeMatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApeMatKeyTyped
        jlbName.setText("Name: " + jtfNombre.getText() + "  " + jtfApePat.getText() + "  "+ jtfApeMat.getText());
    }//GEN-LAST:event_jtfApeMatKeyTyped

    @Override
    public void setObject(Object bean) {
        this.bean = bean;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlbAoeMat;
    private javax.swing.JLabel jlbApePat;
    private javax.swing.JLabel jlbName;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JTextField jtfApeMat;
    private javax.swing.JTextField jtfApePat;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
