package recta;

import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.awt.*;



public class PointsFrame extends JPanel{
    JLabel title, lblPoint, lblX, lblY;
    JButton create, clean, prev;
    public ArrayList<Point> arrayPoints;
    JTextField fldX, fldY;
    int pointIndicator = 0;
    LineFrame linePoint;

    public PointsFrame(LineFrame linePoint) {

        this.linePoint = linePoint;
        arrayPoints = new ArrayList<Point>();
        this.setLayout(new GridBagLayout());
        this.setBackground( new Color(72, 88, 111) );

        drawComponents();
    }

    private void drawComponents() {

        JPanel componentsContainer = new JPanel();

        GridBagConstraints geneConstraints = new GridBagConstraints();
        geneConstraints.gridwidth = GridBagConstraints.REMAINDER;
        geneConstraints.fill = GridBagConstraints.HORIZONTAL;
        geneConstraints.insets = new Insets(30, 10, 10, 10);

        componentsContainer.setForeground(Color.white);
        componentsContainer.setBackground( new Color(72, 88, 111) );
        GridBagConstraints compConstraints = new GridBagConstraints();
        componentsContainer.setLayout(new GridBagLayout());

        compConstraints.insets = new Insets(10, 0, 10, 0);
        

        lblPoint = new JLabel("Punto " + (pointIndicator + 1));
        lblPoint.setFont(new Font("Arial", Font.BOLD, 24));
        lblPoint.setForeground(Color.white);
        compConstraints.weightx = 1.;
        compConstraints.fill = GridBagConstraints.HORIZONTAL;
        compConstraints.gridwidth = GridBagConstraints.REMAINDER;

        lblX = new JLabel("Punto en X");
        lblX.setFont(new Font("Verdana", Font.BOLD, 24));
        lblX.setForeground(Color.white);

        lblY = new JLabel("Punto en Y");
        lblY.setFont(new Font("Verdana", Font.BOLD, 24));
        lblY.setForeground(Color.white);

        fldX = new JTextField();
        fldY = new JTextField();
        fldX.setSize(300, 50);
        fldY.setSize(300, 50);

        componentsContainer.add(lblPoint, compConstraints);

        componentsContainer.add(lblX, compConstraints);
        componentsContainer.add(fldX, compConstraints);

        componentsContainer.add(lblY, compConstraints);
        componentsContainer.add(fldY, compConstraints);

        JPanel buttonsContainer = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonsContainer.setBackground( new Color(72, 88, 111) );
        buttonsContainer.setBorder(new EmptyBorder(20, 20, 20, 20));
        buttons(this);
        buttonsContainer.add(create);
        buttonsContainer.add(clean);
        buttonsContainer.add(prev);

        this.add(componentsContainer, geneConstraints);
        this.add(buttonsContainer, geneConstraints);
    }

    public void buttons(PointsFrame points){
        create = new JButton("Crear punto");
        clean = new JButton("Limpiar campos");
        prev = new JButton("Eliminar puntos");

        prev.setFont(new Font("Verdana", Font.BOLD, 12));
        create.setFont(new Font("Verdana", Font.BOLD, 12));
        clean.setFont(new Font("Verdana", Font.BOLD, 12));
        
        prev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arrayPoints.clear();
                lblPoint.setText("Punto " + (arrayPoints.size() + 1));
                linePoint = new LineFrame(points);

                fldX.setText("");
                fldY.setText(""); 
            }
        });

        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    if (fldX.getText().equals("") || fldY.getText().equals(""))
                        JOptionPane.showMessageDialog(null, "Ingrese cordenadas validas", "Error", JOptionPane.ERROR_MESSAGE);
                    if (arrayPoints.size() != 2) {

                        arrayPoints.add(new Point(Integer.parseInt(fldX.getText()), Integer.parseInt(fldY.getText())));
                        JOptionPane.showMessageDialog(null, "Punto creado exitosamente", "",JOptionPane.INFORMATION_MESSAGE);

                        if (arrayPoints.size() < 2) {
                            lblPoint.setText("Punto " + (arrayPoints.size() + 1));
                        } else {
                            lblPoint.setText("Punto " + arrayPoints.size());
                            linePoint = new LineFrame(points);
                        }

                    } else JOptionPane.showMessageDialog(null, "Ya ingresó los puntos necesarios", "Error",JOptionPane.ERROR_MESSAGE);


            }
        });

        clean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                fldX.setText("");
                fldY.setText("");     
            }
        });
    }
}
