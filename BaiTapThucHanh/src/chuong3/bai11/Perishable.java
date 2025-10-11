/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 5:08:32 PM
 */

package chuong3.bai11;

/**
 * 
 */
import java.time.LocalDate;

public class Perishable extends Good {
    private LocalDate mfgDate;
    private LocalDate expDate;
    private String supplier;

    public Perishable(String id, String name, int quantity, double unitPrice,
                      LocalDate mfgDate, LocalDate expDate, String supplier) {
        super(id, name, quantity, unitPrice);
        this.mfgDate = mfgDate;
        this.expDate = expDate;
        this.supplier = supplier;
    }

    @Override
    public double vatRate() {
        return 0.05;
    }

    @Override
    public String type() {
        return "Perishable";
    }

    @Override
    public String extraInfo() {
        return supplier;
    }

    @Override
    public String rating() {
        if (getQuantity() > 0 && expDate.isBefore(LocalDate.now())) {
            return "Difficult";
        }
        return "Normal";
    }
}

