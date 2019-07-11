package aplicacionesgraficas;

import aplicacionesgraficas.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Images{
    public static void main(String[] args) {
        Frame frame = new Frame("Frame with Pictures");
        PanelImage panel = new PanelImage();

        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class PanelImage extends JPanel{

    private Image image;

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        File file = new File("aplicacionesgraficas/Noah_Cyrus_Again.jpg");
        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            System.out.println("Picture not found");            
        }

        g.drawImage(image, 30, 50, null);
    }
}

/*
    Note:            width, height
    My pc's resolution: 1366, 768 (16:9)

    Midpoitn width: 1366/2 = 683/2 = 341.5
    Midpoint height: 768/2 = 384/2 = 192
*/
