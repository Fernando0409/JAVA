package aplicacionesgraficas;

import javax.swing.JFrame;
import java.awt.*;

public class Marcos2{
    public static void main(String[] args) {
        CenterFrame frame = new CenterFrame("My frame");
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

/*
    Note:            width, height
    My pc's resolution: 1366, 768 (16:9)

    Midpoitn width: 1366/2 = 683/2 = 341.5
    Midpoint height: 768/2 = 384/2 = 192
*/