/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 5:10:05 PM
 */

package chuong3.bai11;

/**
 * 
 */
public class Electrical extends Good {
    private int warrantyMonths;
    private double powerKW;

    public Electrical(String id, String name, int quantity, double unitPrice,
                      int warrantyMonths, double powerKW) {
        super(id, name, quantity, unitPrice);
        this.warrantyMonths = warrantyMonths;
        this.powerKW = powerKW;
    }

    @Override
    public double vatRate() {
        return 0.10;
    }

    @Override
    public String type() {
        return "Electrical";
    }

    @Override
    public String extraInfo() {
        return warrantyMonths + "mo " + powerKW + "KW";
    }

    @Override
    public String rating() {
        if (getQuantity() < 3) {
            return "Easy";
        }
        return "Normal";
    }
}

