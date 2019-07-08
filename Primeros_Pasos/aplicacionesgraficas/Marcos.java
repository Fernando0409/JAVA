package aplicacionesgraficas;

import java.awt.Frame;
import javax.swing.JFrame;

public class Marcos{
    public static void main(String[] args) {
        MyFrame frame = new MyFrame("My first frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Method that close the window
    }
}

class MyFrame extends JFrame{
    
    public MyFrame(String title){
        super(title);   // Call to constructor of class JFrame
        setSize(500, 300); // Width, Height 
        setVisible(true);
    }
}