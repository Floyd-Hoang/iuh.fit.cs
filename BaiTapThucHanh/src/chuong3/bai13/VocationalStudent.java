/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 8:47:15 PM
 */

package chuong3.bai13;

/**
 * 
 */
public class VocationalStudent extends Student {
    private int months;

    public VocationalStudent(String name, String address, int months) {
        super(name, address);
        this.months = months;
    }

    @Override
    public String getLevel() {
        return "Vocational (" + months + "m)";
    }
}

