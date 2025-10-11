/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 7:21:47 PM
 */

package chuong3.bai12;

/**
 * 
 */
public abstract class Vehicle {
    protected String id;
    protected String model;
    protected double price;
    
    public Vehicle(String id, String model, double price) {
        this.id = id;
        this.model = model;
        this.price = price;
    }
    
    public String getId() {
        return id;
    }
    
    public String getModel() {
        return model;
    }
    
    public double getPrice() {
        return price;
    }
    
    public abstract double taxAmount();
    
    public abstract String type();
    
    @Override
    public String toString() {
        return String.format("%-8s %-18s %,15.0f %,15.0f %-12s",
                id, model, price, taxAmount(), type());
    }
}
