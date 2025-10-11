/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 7:23:02 PM
 */

package chuong3.bai12;

/**
 * 
 */
public class Motorbike extends Vehicle {
    
    public Motorbike(String id, String model, double price) {
        super(id, model, price);
    }
    
    @Override
    public double taxAmount() {
        return price * 0.10 + price * 0.05;
    }
    
    @Override
    public String type() {
        return "Motorbike";
    }
}
