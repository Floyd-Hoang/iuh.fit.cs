package chuong3.bai10;

/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 4:05:47 PM
 */

import java.util.*;

public class Manager {
    private Person[] list;
    private int size;

    public Manager(int capacity) {
        list = new Person[capacity];
        size = 0;
    }

    public void add(Person p) {
        if (size == list.length) {
            list = Arrays.copyOf(list, list.length + list.length / 2);
        }
        list[size++] = p;
    }

    public boolean remove(String name) {
        for (int i = 0; i < size; i++) {
            if (list[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < size - 1; j++) {
                    list[j] = list[j + 1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    public void sortByName() {
        Arrays.sort(list, 0, size, Comparator.comparing(Person::getName));
    }

    public void displayAll() {
        System.out.println("\n" + "=".repeat(120));
        System.out.printf("%-20s %-25s %-8s %-8s %-8s %-15s %-15s %-10s%n",
                "Name", "Address", "Score1", "Score2", "Average", 
                "Coeff/Company", "Salary/Invoice", "Type");
        System.out.println("=".repeat(120));
        
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }
        System.out.println("=".repeat(120));
    }
}
