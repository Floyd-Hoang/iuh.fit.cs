/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 7:22:33 PM
 */

package chuong3.bai12;

/**
 * 
 */
public class Bicycle extends Vehicle {
    
    public Bicycle(String id, String model, double price) {
        super(id, model, price);
    }
    
    @Override
    public double taxAmount() {
        return 0;
    }
    
    @Override
    public String type() {
        return "Bicycle";
    }
}

