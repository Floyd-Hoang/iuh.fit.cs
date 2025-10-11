/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 8:46:16 PM
 */

package chuong3.bai13;

/**
 * 
 */
public class Person {
    private String name;
    private String address;

    public Person() { }

    public Person(String name, String address) {
        this.name    = name;
        this.address = address;
    }

    public String getName()    { return name;    }
    public String getAddress() { return address; }

    public void setName(String name)       { this.name = name;    }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return String.format("%-20s %-30s", name, address);
    }
}

