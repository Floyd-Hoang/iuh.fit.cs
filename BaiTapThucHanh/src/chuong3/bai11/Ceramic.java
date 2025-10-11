/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 5:09:13 PM
 */

package chuong3.bai11;

/**
 * 
 */
import java.time.LocalDate;

public class Ceramic extends Good {
    private String manufacturer;
    private LocalDate importDate;

    public Ceramic(String id, String name, int quantity, double unitPrice,
                   String manufacturer, LocalDate importDate) {
        super(id, name, quantity, unitPrice);
        this.manufacturer = manufacturer;
        this.importDate = importDate;
    }

    @Override
    public double vatRate() {
        return 0.10;
    }

    @Override
    public String type() {
        return "Ceramic";
    }

    @Override
    public String extraInfo() {
        return manufacturer;
    }

    @Override
    public String rating() {
        if (getQuantity() > 50 && importDate.plusDays(10).isBefore(LocalDate.now())) {
            return "Slow";
        }
        return "Normal";
    }
}
