package poo;

import javax.swing.JOptionPane;
import poo.Coche;

public class Use_coche{
    public static void main(String[] args) {
        int optionUser = 0;
        String nameUser = JOptionPane.showInputDialog(null, "Type your name.", "Notification", 1);
        
        Coche car = new Coche("MaxSpeed", 5, "Dark Blue", 50000);

        JOptionPane.showMessageDialog(null, "Welcome "+nameUser+"\nEnjoy the trip.", "Notification", 1);

        do{
            optionUser = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose an option: \n"+
                                                                            "Turn On (1) \nTurn Off (2)\n"+
                                                                            "Move (3) \nStop (4)\n"+
                                                                            "Exit(5)\n"));
            switch(optionUser){
                case 1:
                    car.setTurnOn();
                    break;
                case 2:
                    car.setTurnOff();
                    break;
                case 3:
                    car.setMove();
                    break;
                case 4:
                    car.setStop();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Good Bye "+nameUser+"\nSee you later.", "Notification", 1);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Option invalid", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }while(optionUser!=5);
    }
}