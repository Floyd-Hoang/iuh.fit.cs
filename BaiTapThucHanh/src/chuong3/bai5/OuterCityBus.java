/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 12:40:50 AM
 */

package chuong3.bai5;

/**
 * 
 */
public class OuterCityBus extends Vehicle {
    private String destination;
    private int daysTraveled;

    public OuterCityBus(String tripID, String driverName, String licensePlate,
                        String destination, int daysTraveled, double revenue) {
        super(tripID, driverName, licensePlate, revenue);
        this.destination = destination;
        this.daysTraveled = daysTraveled;
    }

    @Override
    public String getType() {
        return "Ngoại thành";
    }

    @Override
    public String toString() {
        return String.format("%-8s | %-15s | %-10s | %10.0f | %-10s | %3d | %-10s",
            tripID, driverName, licensePlate, revenue, destination, daysTraveled, getType());
    }
}

