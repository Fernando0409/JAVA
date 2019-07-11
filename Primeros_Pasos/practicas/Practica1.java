package practicas;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.Toolkit;

import java.io.IOException;
import java.io.File;

public class Practica1{
    public static void main(String[] args) {
        FramePractica1 frame = new FramePractica1("Practice 1 - My Favorite Songs");
        PanelPractica1 panel = new PanelPractica1();

        frame.add(panel);
    }
}

class FramePractica1 extends JFrame{

    public FramePractica1(String title){
        super(title);

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Dimension sizeWindow = toolkit.getScreenSize();
        int width = (int) sizeWindow.getWidth();
        int height = (int) sizeWindow.getHeight();

        setBounds(width/4, height/4, 800, 300);

        Image icon = toolkit.getImage("practicas/img/tux.png");
        
        setResizable(false);
        setIconImage(icon);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class PanelPractica1 extends JPanel{
    
    private BufferedImage image, image1, image2;

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D graphics2d = (Graphics2D) g;
        Font fontString = new Font("Nano Sans", Font.BOLD, 13);

        // Set the font of letter & write the song's name
        graphics2d.setFont(fontString);
        graphics2d.drawString("Noah Cyrus ft. XXXTENTACION", 15, 15);
        graphics2d.drawString("S3RL - Forbidden", 330, 15);
        graphics2d.drawString("Rosas - La Oreja de Van Gogh", 550, 15);

        // Get the pictures
        try{
            image = ImageIO.read(new File("practicas/img/Noah_Cyrus_Again.jpg"));
            image1 = ImageIO.read(new File("practicas/img/forbidden.jpg"));
            image2 = ImageIO.read(new File("practicas/img/rosas.jpg"));

        }catch(IOException e){
            System.out.println("Picture not found");
        }

        // Show the pictures in the frame
        graphics2d.drawImage(image, 15, 20, null);
        graphics2d.drawImage(image1, 280, 20, 220, 220, null);
        graphics2d.drawImage(image2, 535, 20, 250, 220, null); 
        
    }
}
