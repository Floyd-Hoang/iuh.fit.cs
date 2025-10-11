/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 8:49:09 AM
 */

package chuong3.bai13;

/**
 * 
 */
public class LinkedStudent extends Student {
    private String country;

    public LinkedStudent(String name, String address, String country) {
        super(name, address);
        this.country = country;
    }

    @Override
    public String getLevel() {
        return "Linked (" + country + ")";
    }
}

