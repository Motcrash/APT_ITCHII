package recta;

import java.util.ArrayList;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LineFrame extends JPanel{
    ArrayList<Point> arrayPoints;
    JLabel lblSetX, lblSetY, lblDistance, lblResult;
    JButton eraseFields, distanceValue;

    public LineFrame() {
        arrayPoints = new ArrayList<Point>();
        this.setBackground( new Color(30, 140, 147)  );
        this.setLayout( new GridBagLayout() );
        drawComponents();
    }

    public LineFrame(PointsFrame points) {
        arrayPoints = points.arrayPoints;
        this.setLayout( new GridBagLayout() );
        this.setBackground( new Color(30, 140, 147) );
        drawComponents();

    }

    public void drawComponents() {


        JPanel lineContainer = new JPanel();

        GridBagConstraints generalConstraint = new GridBagConstraints();
        generalConstraint.gridwidth = GridBagConstraints.REMAINDER;
        generalConstraint.fill = GridBagConstraints.HORIZONTAL;
        generalConstraint.insets = new Insets(10, 10, 10, 10);

        lineContainer.setForeground(Color.white);
        lineContainer.setBackground( new Color(30, 140, 147)  );
        lineContainer.setBorder( BorderFactory.createEmptyBorder(50, 50, 50, 100) );
        GridBagConstraints compConstraints = new GridBagConstraints();
        lineContainer.setLayout(new GridBagLayout());
        if (arrayPoints.size() == 2) {
            compConstraints.weightx = 1.;
            compConstraints.fill = GridBagConstraints.HORIZONTAL;
            compConstraints.gridwidth = GridBagConstraints.REMAINDER;
            compConstraints.insets = new Insets(15,0,15,0);
            lblSetX = new JLabel("Punto en X: " + arrayPoints.get(0).getX() + " , " + arrayPoints.get(1).getX());
            lblSetX.setFont(new Font("Verdana", Font.BOLD, 24));
            lblSetX.setForeground(Color.white);

            lblSetY = new JLabel("Punto en Y: " + arrayPoints.get(0).getY() + " , " + arrayPoints.get(1).getY());
            lblSetY.setFont(new Font("Verdana", Font.BOLD, 24));
            lblSetY.setForeground(Color.white);
            lblResult = new JLabel();
            lblResult.setFont(new Font("Verdana", Font.BOLD, 15));
            lblResult.setForeground(Color.white);
            lblResult.setSize(500, 50);
            lineContainer.add(lblSetX, compConstraints);
            lineContainer.add(lblSetY, compConstraints);
            lineContainer.add(lblResult, compConstraints);
        } else {
            lblSetX = new JLabel("Debe asignar los dos puntos para continuar");
            lblSetX.setFont(new Font("Verdana", Font.BOLD, 24));
            lblSetX.setForeground(Color.white);

            lineContainer.add(lblSetX, generalConstraint);

        }

        JPanel btnContainer = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btnContainer.setBackground( new Color(30, 140, 147)  );
        btnContainer.setBorder( new EmptyBorder(10, 20, 10, 20) );
        DrawButtons();
        btnContainer.add(distanceValue);
        btnContainer.add(eraseFields);

        this.add(lineContainer, generalConstraint);
        this.add(btnContainer, generalConstraint);

    }

    public void DrawButtons() {
        distanceValue = new JButton("Calcular la distancia");
        eraseFields = new JButton("Borrar");

        distanceValue.setFont(new Font("Verdana", Font.BOLD, 12));
        eraseFields.setFont(new Font("Verdana", Font.BOLD, 12));

        eraseFields.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                try {
                    if (lblResult == null)
                        throw new Exception("No hay Puntos para calcular la distancia");
                    if (lblResult.getText().equalsIgnoreCase(""))
                        throw new Exception("Los campos ya estan vacios");
                    else {
                        lblResult.setText("");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        distanceValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                try {
                    if (arrayPoints.size() == 2) {
                        Straight straight = new Straight(arrayPoints.get(0), arrayPoints.get(1));
                        lblResult.setText("La distancia entre los puntos es: " + straight.distancia());
                    } else {
                        throw new Exception("Numero de puntos insuficiente");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }

    public ArrayList<Point> getarrayPoints() {
        return arrayPoints;
    }

    public void setarrayPoints(ArrayList<Point> arrayPoints) {
        this.arrayPoints = arrayPoints;
    }
}
