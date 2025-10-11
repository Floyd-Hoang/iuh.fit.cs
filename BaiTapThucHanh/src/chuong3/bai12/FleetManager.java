/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 7:26:43 PM
 */

package chuong3.bai12;

/**
 * 
 */
import java.util.*;

public class FleetManager {
    private List<Vehicle> fleet;
    
    public FleetManager() {
        fleet = new ArrayList<>();
    }
    
    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }
    
    public void displayAll() {
        System.out.printf("%-8s %-18s %15s %15s %-12s%n",
                "ID", "Model", "Price", "Tax Amount", "Type");
        System.out.println("=".repeat(75));
        
        for (Vehicle vehicle : fleet) {
            System.out.println(vehicle);
        }
        System.out.println("=".repeat(75));
    }
    
    public Map<String, Integer> countByType() {
        Map<String, Integer> typeCount = new HashMap<>();
        
        for (Vehicle vehicle : fleet) {
            String type = vehicle.type();
            typeCount.put(type, typeCount.getOrDefault(type, 0) + 1);
        }
        
        return typeCount;
    }
    
    public double totalTaxAmount() {
        double total = 0;
        for (Vehicle vehicle : fleet) {
            total += vehicle.taxAmount();
        }
        return total;
    }
    
    public Vehicle findMostExpensiveVehicle() {
        if (fleet.isEmpty()) {
            return null;
        }
        
        Vehicle mostExpensive = fleet.get(0);
        for (Vehicle vehicle : fleet) {
            if (vehicle.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = vehicle;
            }
        }
        return mostExpensive;
    }
}
