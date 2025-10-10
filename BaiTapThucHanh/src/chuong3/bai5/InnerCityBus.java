/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 12:37:47 AM
 */

package chuong3.bai5;

/**
 * 
 */
public class InnerCityBus extends Vehicle {
    private int routeNumber;
    private double distanceKm;

    public InnerCityBus(String tripID, String driverName, String licensePlate,
                        int routeNumber, double distanceKm, double revenue) {
        super(tripID, driverName, licensePlate, revenue);
        this.routeNumber = routeNumber;
        this.distanceKm = distanceKm;
    }

    @Override
    public String getType() {
        return "Nội thành";
    }

    @Override
    public String toString() {
        return String.format("%-8s | %-15s | %-10s | %10.0f | %6d | %7.1f | %-10s",
            tripID, driverName, licensePlate, revenue, routeNumber, distanceKm, getType());
    }
}


