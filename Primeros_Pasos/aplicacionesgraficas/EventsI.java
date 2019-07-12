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

	JButton blueButton = new JButton("Blue Button");
	JButton yellowButton = new JButton("Yellow Button");
	JButton redButton = new JButton("Red Button");

	public PanelEventsI(){
		// Show the buttons in the panel
		add(blueButton); 
		add(redButton);
		add(yellowButton);

		// No se que poner pero establecemos el tipo de evento, quien lo hace y quien lo recibira/sufrira los cambios
		// objectSource.typeEvent(Listener)
		blueButton.addActionListener(this);
		yellowButton.addActionListener(this);
		redButton.addActionListener(this);
	}

	// Action that realized the blueButton, action listener's method 
	public void actionPerformed(ActionEvent e){
		// Gets the source of event & changes the color
		Object sourceEvent = e.getSource();

		if(sourceEvent == blueButton)
			setBackground(Color.BLUE);
		else if(sourceEvent == redButton)
			setBackground(Color.RED);
		else
			setBackground(Color.YELLOW);
	}
}
