/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 5:11:04 PM
 */

package chuong3.bai11;

/**
 * 
 */
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Scanner scanner = new Scanner(System.in);

        warehouse.add(new Perishable("P001", "Milk", 100, 25000,
                LocalDate.of(2025, 1, 1), LocalDate.of(2025, 6, 1), "VinaMilk"));

        warehouse.add(new Ceramic("C001", "Vase", 60, 150000,
                "BatTrang", LocalDate.of(2025, 9, 1)));

        warehouse.add(new Electrical("E001", "Fridge", 2, 8000000,
                24, 1.5));

        warehouse.add(new Electrical("E002", "TV", 15, 12000000,
                12, 0.8));

        int choice;
        do {
            System.out.println("\n=== WAREHOUSE MANAGEMENT ===");
            System.out.println("1. Add Perishable");
            System.out.println("2. Add Ceramic");
            System.out.println("3. Add Electrical");
            System.out.println("4. Display All");
            System.out.println("5. Count by Type");
            System.out.println("6. Average Perishable Value");
            System.out.println("7. Show Difficult Goods");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String pid = scanner.nextLine();
                    System.out.print("Name: ");
                    String pname = scanner.nextLine();
                    System.out.print("Quantity: ");
                    int pqty = scanner.nextInt();
                    System.out.print("Unit Price: ");
                    double pprice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Supplier: ");
                    String supplier = scanner.nextLine();

                    warehouse.add(new Perishable(pid, pname, pqty, pprice,
                            LocalDate.now(), LocalDate.now().plusMonths(6), supplier));
                    break;

                case 2:
                    System.out.print("ID: ");
                    String cid = scanner.nextLine();
                    System.out.print("Name: ");
                    String cname = scanner.nextLine();
                    System.out.print("Quantity: ");
                    int cqty = scanner.nextInt();
                    System.out.print("Unit Price: ");
                    double cprice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Manufacturer: ");
                    String manufacturer = scanner.nextLine();

                    warehouse.add(new Ceramic(cid, cname, cqty, cprice,
                            manufacturer, LocalDate.now()));
                    break;

                case 3:
                    System.out.print("ID: ");
                    String eid = scanner.nextLine();
                    System.out.print("Name: ");
                    String ename = scanner.nextLine();
                    System.out.print("Quantity: ");
                    int eqty = scanner.nextInt();
                    System.out.print("Unit Price: ");
                    double eprice = scanner.nextDouble();
                    System.out.print("Warranty Months: ");
                    int warranty = scanner.nextInt();
                    System.out.print("Power KW: ");
                    double power = scanner.nextDouble();
                    scanner.nextLine();

                    warehouse.add(new Electrical(eid, ename, eqty, eprice, warranty, power));
                    break;

                case 4:
                    warehouse.displayAll();
                    break;

                case 5:
                    Map<String, Long> counts = warehouse.countByType();
                    System.out.println("Perishable: " + counts.getOrDefault("Perishable", 0L));
                    System.out.println("Ceramic: " + counts.getOrDefault("Ceramic", 0L));
                    System.out.println("Electrical: " + counts.getOrDefault("Electrical", 0L));
                    break;

                case 6:
                    System.out.printf("Average Perishable Value: %,.0f%n",
                            warehouse.averagePerishableValue());
                    break;

                case 7:
                    List<Good> difficult = warehouse.getDifficultGoods();
                    System.out.println("Difficult goods:");
                    for (Good good : difficult) {
                        System.out.println(good);
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

