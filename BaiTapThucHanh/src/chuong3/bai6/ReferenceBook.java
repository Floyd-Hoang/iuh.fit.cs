/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 1:44:14 AM
 */

package chuong3.bai6;

/**
 * 
 */
public class ReferenceBook extends Book {
    private double tax;

    public ReferenceBook(String id, String pubDate, double unitPrice, int quantity, String publisher, double tax) {
        super(id, pubDate, unitPrice, quantity, publisher);
        this.tax = tax;
    }

    @Override
    public double totalPrice() {
        return quantity * unitPrice + tax;
    }

    @Override
    public String getType() { return "Tham khao"; }

    @Override
    public String toString() {
        return super.toString() + String.format(" %,10.0f %,12.0f", tax, totalPrice());
    }
}
