package aplicacionesgraficas;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Image;
import javax.swing.JFrame;

public class Frame extends JFrame{
    
    public Frame(String title){
        super(title);
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        int height = dimension.height;
        int width = dimension.width;

        setBounds(width/4, height/4, width/2, height/2);

        Image icon = toolkit.getImage("aplicacionesgraficas/img/tux.png");
        setIconImage(icon);
    }
}

