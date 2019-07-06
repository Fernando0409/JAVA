package poo;

import javax.swing.JOptionPane;

public class Coche{
    // Cars' propietaries
    private String company, color;
    private int llantas, seats;
    private float price, weight;
    private boolean turnOn;

    public Coche(String company, int seats, String color, float price){
        this.seats = seats;
        this.color = color;
        this.company = company;
        this.price = price;
        
        this.llantas = 4;
        this.weight = 100; // Kg
        this.turnOn = false;
    }

    public Coche(String company, int seats, float price){
        this(company, seats, "Not found", price); // Call the main constructor
    }

    // Methods setters & getters

    public String getInformation(){
        String description = "Company: "+company+"\n"+
                             "Seats: "+seats+"\n"+
                             "Color: "+color+"\n"+
                             "Weight: "+weight+"\n"+
                             "Price: "+price+"\n";
        return description;
    }

    public void setTurnOn(){
        if(turnOn == false){
            JOptionPane.showMessageDialog(null, "Car turns on.", "Notification.", JOptionPane.INFORMATION_MESSAGE);
            turnOn = true;
        }
        else
            JOptionPane.showMessageDialog(null, "The car is turn on.", "Notification.", JOptionPane.INFORMATION_MESSAGE);
    }

    public void setTurnOff(){
        if(turnOn == true){
            JOptionPane.showMessageDialog(null, "Car turns off.", "Notification.", JOptionPane.INFORMATION_MESSAGE);
            turnOn = false;       
        } 
        else
            JOptionPane.showMessageDialog(null, "Car is turn off.", "Notification.", JOptionPane.INFORMATION_MESSAGE);
    }

    public void setStop(){
        if(turnOn == true)
            JOptionPane.showMessageDialog(null, "Car stops.", "Stop", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Car is turn off.", "Notification", JOptionPane.INFORMATION_MESSAGE);
    }

    public void setMove(){
        if(turnOn == true){
            String side = JOptionPane.showInputDialog(null, "Type the side.", "Information.", 1);
            JOptionPane.showMessageDialog(null, "The car moves the side "+ side, "Notification", 1);
        }
        else
            JOptionPane.showMessageDialog(null, "The car isn't turn on.", "Notification", 1);
    }


    public void setColor(){
        String color = JOptionPane.showInputDialog(null, "Type color of car.", "Color", JOptionPane.INFORMATION_MESSAGE);
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setCompany(){
        String company = JOptionPane.showInputDialog(null, "Type company of car. ", "Company.", JOptionPane.INFORMATION_MESSAGE);
        this.company = company;
    }

    public String getCompany(){
        return company;
    }
    
    public void setPrice(){
        float price = Float.parseFloat(JOptionPane.showInputDialog(null, "Type price of car.", 
                                        "Price.", JOptionPane.INFORMATION_MESSAGE));
        this.price = price;
    }

    public float getPrice(){
        return price;
    }

    public int getSeats(){
        return seats;
    }
}