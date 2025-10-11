/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 7:25:07 PM
 */

package chuong3.bai12;

/**
 * 
 */
public class PassengerCar extends Vehicle {
    private int seats;
    
    public PassengerCar(String id, String model, double price, int seats) {
        super(id, model, price);
        this.seats = seats;
    }
    
    public int getSeats() {
        return seats;
    }
    
    @Override
    public double taxAmount() {
        double specialTax;
        if (seats >= 5) {
            specialTax = price * 0.30;
        } else {
            specialTax = price * 0.50;
        }
        return specialTax + price * 0.10 + price * 0.20;
    }
    
    @Override
    public String type() {
        return "Passenger";
    }
}

