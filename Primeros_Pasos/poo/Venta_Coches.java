package poo;

import javax.swing.JOptionPane;

import poo.Coche;

public class Venta_Coches extends Coche{
    
    // Propietaries
    private int cantidadCoches;
    private String nameClient, nameEmployee;
    private String dateBought; 
 
    public Venta_Coches(String company, int cantidadCoche, int seats, String color){
        this(company, seats, color, 50000);
        this.cantidadCoches = cantidadCoche;
    }

    public Venta_Coches(String company, int cantidadCoches, int seats){
        this(company, seats, 50000);
        this.cantidadCoches = cantidadCoches;
    }

    // Methods setters & getters

    public void setCantidadCoches(int cantidad){
        cantidadCoches = cantidad;
    }
    
    public int getCantidadCoches(){
        return cantidadCoches;
    }

    public void setDateBought(String date){
        dateBought = date;
    }

    public String getDateBought(){
		return "The car was bought on "+dateBought+string;
    }

    public void setNameClient(String nameClient){
        this.nameClient = nameClient;
    }

    public String getNameClient(){
        return nameClient;
    }

    public void setNameEmployee(String nameEmployee){
        this.nameEmployee = nameEmployee;
    }

    public String getNameEmployee(){
        return nameEmployee;
    }


    public void boughtCar(String nameClient, String nameEmployee, String date){
        // Methods of class "Coche"
        setCompany();
        setPrice();
        setColor();

        setNameClient(nameClient);
        setNameEmployee(nameEmployee);
        setDateBought(date);
        
    }

    public void getBill(){
        String information = "Company: "+super.getCompany()+"\n"+
                             "Color: "+super.getColor()+"\n"+
                             "Seats: "+super.getSeats()+"\n\n"+
                             
                             "Name Cliet: "+getNameClient()+"\n"+
                             "Name Employee"+getNameEmployee()+"\n"+
                             "Date Bought:"+getDateBought()+"\n"+
                             "Price: "+super.getPrice()+"\n";
    }

    public void setRefund(String nameClient, String company){
        if(company == super.getCompany() && nameClient == getNameClient()){
            JOptionPane.showInputDialog(null, "Type the unconformity.", "Information.", 1);
            JOptionPane.showMessageDialog(null, "Thank you.", "Notification", 1);
        } 
        else
            JOptionPane.showMessageDialog(null, "We can't found register of this car");

    }
}