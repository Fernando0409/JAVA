package aplicacionesgraficas;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Marcos2{
    public static void main(String[] args) {
        CenterFrame frame = new CenterFrame("My frame");
        
        Panel panel = new Panel();
        frame.add(panel);   // Add the frame the component panel
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class CenterFrame extends JFrame{

    public CenterFrame(String title){
        super(title);
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension sizeWindow = toolkit.getScreenSize();

        /* Get height & width windows, two ways different */ 
        int height = sizeWindow.height;
        //int height2 = (int) sizeWindow.getHeight();

        int width = sizeWindow.width;
        //int width2 = (int) sizeWindow.getWidth(); 

        setBounds(width/4, height/4, width/2, height/2); // Center Window

        // Icon window
        Image icon = toolkit.getImage("aplicacionesgraficas/tux.png");
        setIconImage(icon);

    }
}   


class Panel extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponent(g);    // Call you to method in the father's class
        g.drawString("Hello World! Painting with Graphics", 50, 30);

        // Graphics 
        g.drawRect(50, 50, 70, 40); // 90, 120
        g.drawLine(50, 100, 120, 100);

        // Graphics 2D
        Graphics2D graphics2d = (Graphics2D) g;

        Rectangle2D rectangle = new Rectangle2D.Double(100, 120, 200, 150);
        
        Ellipse2D ellipse = new Ellipse2D.Double();
        ellipse.setFrame(rectangle);

        graphics2d.draw(ellipse);
        graphics2d.draw(rectangle);

    }
}

/*
    Note:            width, height
    My pc's resolution: 1366, 768 (16:9)

    Midpoitn width: 1366/2 = 683/2 = 341.5
    Midpoint height: 768/2 = 384/2 = 192
*/