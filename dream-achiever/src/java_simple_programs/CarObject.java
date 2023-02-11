/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_simple_programs;

/**
 *
 * @author hemas
 */
/*public class Car2{
    public static void main(String[] args){
        Car2 c1 = new Car2("audi","tesla","red",2023,250000,1);
        String result = c1.toString();
    System.out.println(result);
    }
}*/
    
class Car {
    
    private String model, brand, colour;
    private int year, price, quantity;
    
    Car(String model, String brand, String colour, int year, int price, int quantity){
        this.model = model;
        this.brand = brand;
        this.colour = colour;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model; 
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    
    
    
    
    //can access private class variables like brand ,model within the class directly without getter setter method
   /* public static void main(String[] args){
        String x;
        int y;
        Car c1 = new Car("audi","tesla","red",2023,250000,1);
        x = c1.model;
        x = c1.brand;
        String result = c1.toString();
        System.out.println(result);
    }*/
    
}
public class CarObject{
    public static void main(String[] args){
        String x;
        int y;
        Car c1 = new Car("audi","tesla","red",2023,250000,1);
         
        x = c1.getModel();
        x = c1.getBrand();
        x = c1.getColour();
        y = c1.getYear();
        y = c1.getPrice();
        y = c1.getQuantity();
        
        System.out.println("model: " +c1.getModel());
        System.out.println("brand: " +c1.getBrand());
        System.out.println("colour: " +c1.getColour());
        System.out.println("year: " +c1.getYear());
        System.out.println("price: " +c1.getPrice());
        System.out.println("quantity: " +c1.getQuantity());
        System.out.println();
        
        c1.setModel("bmw");
        c1.setBrand("suzuki");
         
        //String result = c1.toString();
        System.out.println("model: " +c1.getModel());
        System.out.println("brand: " +c1.getBrand());
        System.out.println("colour: " +c1.getColour());
        System.out.println("year: " +c1.getYear());
        System.out.println("price: " +c1.getPrice());
        System.out.println("quantity: " +c1.getQuantity());
        
    }
}
