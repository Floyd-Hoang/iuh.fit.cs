/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 12:35:14 AM
 */

package chuong3.bai5;

/**
 * 
 */
public abstract class Vehicle {
    protected String tripID;
    protected String driverName;
    protected String licensePlate;
    protected double revenue;

    public Vehicle(String tripID, String driverName, String licensePlate, double revenue) {
        this.tripID = tripID;
        this.driverName = driverName;
        this.licensePlate = licensePlate;
        this.revenue = revenue;
    }

    public String getTripID() {
        return tripID;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getRevenue() {
        return revenue;
    }

    public abstract String getType();
}

