package recta;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame{
    JPanel mainContainer, buttonsContainer, framesContainer; 
    JButton btnMainFrame, btnPoints, btnLine;
    
    Menu menu;
    PointsFrame points;
    LineFrame line;

    public App(){

        super("Recta");
        this.setSize(720, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        framesContainer = new JPanel();
        framesContainer.setLayout(new BorderLayout()); 
        framesContainer.setBackground( new Color(255,255,255) );

        DrawButtons();
        menu = new Menu();
        line = new LineFrame();
        points = new PointsFrame(line);

        drawWindow(menu);
        mainContainer = new JPanel();
        mainContainer.setBackground( new Color(131, 152, 142) );
        mainContainer.setLayout( new BorderLayout() );
        mainContainer.add(framesContainer, BorderLayout.CENTER);
        mainContainer.add(buttonsContainer, BorderLayout.SOUTH);

        this.setLayout(new BorderLayout());
        this.add(mainContainer, BorderLayout.CENTER);

    }

    public void DrawButtons() {
        btnMainFrame = new JButton("Menú de inicio");
        btnMainFrame.setSize(200, 40);
        btnMainFrame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawWindow(menu);
            }
        });
        btnPoints = new JButton("Crear puntos");
        btnPoints.setSize(200, 40);
        btnPoints.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawWindow(points);
            }
        });
        btnLine = new JButton("Crear Recta");
        btnLine.setSize(200, 40);
        btnLine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                line = points.linePoint;
                drawWindow(line);
            }
        });

        buttonsContainer = new JPanel();
        buttonsContainer.setBackground( new Color(0,72,83) );
        buttonsContainer.setBorder( BorderFactory.createEmptyBorder(10, 10, 10, 10) );
        buttonsContainer.setLayout( new FlowLayout( FlowLayout.CENTER ) );

        btnMainFrame.setFont(new Font("Verdana", Font.BOLD, 12));
        btnPoints.setFont(new Font("Verdana", Font.BOLD, 12));
        btnLine.setFont(new Font("Verdana", Font.BOLD, 12));

        buttonsContainer.add(btnMainFrame);
        buttonsContainer.add(btnPoints);
        buttonsContainer.add(btnLine);
    }

    private void drawWindow(JPanel frame) {
        frame.setSize(900, 800);
        frame.setLocation(0, 0);

        framesContainer.removeAll();
        framesContainer.add(frame, BorderLayout.CENTER);
        framesContainer.revalidate();
        framesContainer.repaint();
    }

    public static void main(String[] args) {
        App application = new App();
        application.setVisible(true);
    }
    
}