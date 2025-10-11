/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 8:47:51 PM
 */

package chuong3.bai13;

/**
 * 
 */
public class CollegeStudent extends Student {
    private String major;

    public CollegeStudent(String name, String address, String major) {
        super(name, address);
        this.major = major;
    }

    @Override
    public String getLevel() {
        return "College (" + major + ")";
    }
}
