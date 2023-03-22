

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Screen1 extends javax.swing.JFrame {
    JLabel lblFinalPos, lblResult, lblTitle, lblShowResult;
    JTextField fldFinalPos;
    JButton btnAccept, btnClose;

    public Screen1() {
        initComponents();
        lblFinalPos = new JLabel("Limite");
        lblResult = new JLabel("Resultado");
        lblTitle = new JLabel("Serie de Fibonacci");
        lblShowResult = new JLabel("");
        
        
        fldFinalPos = new JTextField(10);
        
        btnAccept = new JButton("Aceptar");
        btnClose = new JButton("Cerrar");
        
        this.add(lblTitle);
        this.add(lblFinalPos);
        this.add(lblResult);
        this.add(lblShowResult);
        this.add(fldFinalPos);
        this.add(btnAccept);
        this.add(btnClose);
        
        lblTitle.setBounds(300,25,200,50);
        lblFinalPos.setBounds(200,100,100,50);
        lblResult.setBounds(200,150,100,50);
        lblShowResult.setBounds(400,150,100,50);
        
        fldFinalPos.setBounds(400,115,100,25);
        
        btnAccept.setBounds(200,300,100,50);
        btnClose.setBounds(400,300,100,50);
        
        btnAccept.addActionListener(new ActionListener(){
            @Override
            
            public void actionPerformed(ActionEvent e){
                Fibonacci fibo = new Fibonacci();
                fibo.setFinalNum((int) Integer.parseInt(fldFinalPos.getText()));
                fibo.fibonacciSerie();
                lblShowResult.setText(Integer.toString(fibo.b));
                JOptionPane.showMessageDialog(btnAccept, fibo.result);
            }
        });
        
        btnClose.addActionListener(new ActionListener(){
            @Override
            
        public void actionPerformed(ActionEvent e){
            Screen1.this.dispose();
        }
        });
        
        this.setBounds(100, 100, 700, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen1().setVisible(true);
            }
        });
    }
    
    class Fibonacci{
        int finalNum, a=0, b=1, c;
        String result="0, 1, ";

        public int getFinalNum() {
            return finalNum;
        }

        public void setFinalNum(int finalNum) {
            this.finalNum = finalNum;
        }
        
        public void fibonacciSerie(){
            for (int i = 0; i < finalNum; i++) {
                c=a;
                a=b;
                b = a+c;
                result += b+", ";
            }
        }
        
     
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
