/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 7:27:55 PM
 */

package chuong3.bai12;

/**
 * 
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FleetManager manager = new FleetManager();
        Scanner scanner = new Scanner(System.in);
        
        manager.addVehicle(new Bicycle("B001", "City Bike Pro", 2500000));
        manager.addVehicle(new Bicycle("B002", "Mountain Bike", 4500000));
        manager.addVehicle(new Motorbike("M001", "Honda Wave", 32000000));
        manager.addVehicle(new Motorbike("M002", "Yamaha Exciter", 45000000));
        manager.addVehicle(new PassengerCar("P001", "Toyota Camry", 850000000, 5));
        manager.addVehicle(new PassengerCar("P002", "BMW Coupe", 1200000000, 4));
        manager.addVehicle(new Truck("T001", "Hyundai Truck", 980000000));
        
        int choice;
        do {
            System.out.println("\n=== VEHICLE FLEET MANAGEMENT ===");
            System.out.println("1. Add Bicycle");
            System.out.println("2. Add Motorbike");
            System.out.println("3. Add Passenger Car");
            System.out.println("4. Add Truck");
            System.out.println("5. Display All Vehicles");
            System.out.println("6. Count by Type");
            System.out.println("7. Total Tax Amount");
            System.out.println("8. Most Expensive Vehicle");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String bicycleId = scanner.nextLine();
                    System.out.print("Model: ");
                    String bicycleModel = scanner.nextLine();
                    System.out.print("Price: ");
                    double bicyclePrice = scanner.nextDouble();
                    scanner.nextLine();
                    
                    manager.addVehicle(new Bicycle(bicycleId, bicycleModel, bicyclePrice));
                    System.out.println("Bicycle added successfully!");
                    break;
                    
                case 2:
                    System.out.print("ID: ");
                    String motorbikeId = scanner.nextLine();
                    System.out.print("Model: ");
                    String motorbikeModel = scanner.nextLine();
                    System.out.print("Price: ");
                    double motorbikePrice = scanner.nextDouble();
                    scanner.nextLine();
                    
                    manager.addVehicle(new Motorbike(motorbikeId, motorbikeModel, motorbikePrice));
                    System.out.println("Motorbike added successfully!");
                    break;
                    
                case 3:
                    System.out.print("ID: ");
                    String carId = scanner.nextLine();
                    System.out.print("Model: ");
                    String carModel = scanner.nextLine();
                    System.out.print("Price: ");
                    double carPrice = scanner.nextDouble();
                    System.out.print("Number of seats: ");
                    int seats = scanner.nextInt();
                    scanner.nextLine();
                    
                    manager.addVehicle(new PassengerCar(carId, carModel, carPrice, seats));
                    System.out.println("Passenger car added successfully!");
                    break;
                    
                case 4:
                    System.out.print("ID: ");
                    String truckId = scanner.nextLine();
                    System.out.print("Model: ");
                    String truckModel = scanner.nextLine();
                    System.out.print("Price: ");
                    double truckPrice = scanner.nextDouble();
                    scanner.nextLine();
                    
                    manager.addVehicle(new Truck(truckId, truckModel, truckPrice));
                    System.out.println("Truck added successfully!");
                    break;
                    
                case 5:
                    manager.displayAll();
                    break;
                    
                case 6:
                    Map<String, Integer> counts = manager.countByType();
                    System.out.println("\nVehicle count by type:");
                    for (Map.Entry<String, Integer> entry : counts.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                    
                case 7:
                    System.out.printf("Total tax amount: %,.0f VND%n", manager.totalTaxAmount());
                    break;
                    
                case 8:
                    Vehicle mostExpensive = manager.findMostExpensiveVehicle();
                    if (mostExpensive != null) {
                        System.out.println("Most expensive vehicle:");
                        System.out.println(mostExpensive);
                    } else {
                        System.out.println("No vehicles in fleet!");
                    }
                    break;
                    
                case 0:
                    System.out.println("Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
        
        scanner.close();
    }
}

