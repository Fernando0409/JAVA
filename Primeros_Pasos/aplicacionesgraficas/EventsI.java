package aplicacionesgraficas;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.JButton;

public class EventsI{

        public static void main(String [] args){	
                Frame frame = new Frame("Events I.");	// Create the window
                PanelEventsI panelEventsI = new PanelEventsI();	// Create the panel that contain my components

                frame.add(panelEventsI);	// Add the panel to my window
		frame.setVisible(true);		// To see the window
                frame.setDefaultCloseOperation(3); // To close the window
        }
}

class PanelEventsI extends JPanel implements ActionListener{

	JButton button = new JButton("Blue Button");

	public PanelEventsI(){
		add(button); // Show button in the panel
		button.addActionListener(this); // Listener the type 'click'
	}

	// Action that realized the button, action listener's method 
	public void actionPerformed(ActionEvent e){
		setBackground(Color.BLUE);
	}
}

// Create a button, this will change the backkground
