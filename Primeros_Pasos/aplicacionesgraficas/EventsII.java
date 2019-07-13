package aplicacionesgraficas;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.*;

public class EventsII{
    public static void main(String[] args) {
        Frame frame = new Frame("Events II");
        PanelEventsII panel = new PanelEventsII();
    }
}

class PanelEventsII extends JPanel{
    
    private JButton blueButton = new JButton("Blue Button");
    private JButton redButton = new JButton("Red Button");
    private JButton yellowButton = new JButton("Yellow Button");

    public PanelEventsII(){
        add(blueButton);
        add(redButton);
        add(yellowButton);
        
        ColorPanel blue = new ColorPanel(Color.BLUE);
        ColorPanel red = new ColorPanel(Color.RED);
        ColorPanel yellow = new ColorPanel(Color.YELLOW);

        blueButton.addActionListener(blue);
        redButton.addActionListener(red);
        yellowButton.addActionListener(yellow);
    }

    private class ColorPanel implements ActionListener{

        private Color colorBackground;

        public ColorPanel(Color color){
            colorBackground = color;
        }

        public void actionPerformed(ActionEvent e){
            setBackground(colorBackground);
        }
    }
}