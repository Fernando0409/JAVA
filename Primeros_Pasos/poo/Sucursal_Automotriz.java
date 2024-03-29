package poo;

import javax.swing.JOptionPane;
import poo.Venta_Coches;

public class Sucursal_Automotriz{
    public static void main(String[] args) {
        
        String company, nameClient, nameEmployee, date, color;
        int cantidadCoche, seats;

        Venta_Coches car = new Venta_Coches();
        int optionUser = 0;

        String menu = "Watch the cars(1) \n Customize my car(2) \nBought a car (3) \nRefused money(4) \nExit(5)";
        
        JOptionPane.showMessageDialog(null, "Welcome to \"Cars Speed\"", "Welcome.", 1);
        do{
            optionUser = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a menu's option:\n"+menu, 
                                                                                "Notification", 1));
            switch(optionUser){
                case 1: // Watch the cars
                    JOptionPane.showMessageDialog(null, "We're working in this service.", "Notification", 1);
                    break;

                case 2: // Bougth a car
                    company = JOptionPane.showInputDialog(null, "Type the company of car.", "Information", 1);
                    cantidadCoche = Integer.parseInt(JOptionPane.showInputDialog(null, "Number of cars that you wanna.", "Information", 1));
                    seats = Integer.parseInt(JOptionPane.showInputDialog(null, "Seats of car(s).", "Information", 1));
                    color = JOptionPane.showInputDialog(null, "Color of car.", "Information", 1);
                    
                    car = new Venta_Coches(company, cantidadCoche, seats, color);

                    nameClient = JOptionPane.showInputDialog(null, "Type name of client.", "Notification", 1);
                    nameEmployee = JOptionPane.showInputDialog(null, "Type name of employee.", "Notification", 1);
                    date = JOptionPane.showInputDialog(null, "Date.", "Notification", 1);

                    car.boughtCar(nameClient, nameEmployee, date);
                    break;

                case 3: // Refused money
                    nameClient = JOptionPane.showInputDialog(null, "Type name of client.", "Notification", 1);
                    company = JOptionPane.showInputDialog(null, "Type the company of car.", "Information", 1);

                    car.setRefund(nameClient, company);
                    break;

                case 4: // Exit
                    JOptionPane.showMessageDialog(null, "Exit", "Notification", 1);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option.", "Error", 0);  
                    break;
            }

        }while(optionUser != 4);
    }
}