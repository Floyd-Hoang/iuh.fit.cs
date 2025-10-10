/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 1:43:37 AM
 */

package chuong3.bai6;

/**
 * 
 */
public class Textbook extends Book {
    private String condition; 

    public Textbook(String id, String pubDate, double unitPrice, int quantity, String publisher, String condition) {
        super(id, pubDate, unitPrice, quantity, publisher);
        this.condition = condition;
    }

    @Override
    public double totalPrice() {
        if (condition.equalsIgnoreCase("moi")) {
            return quantity * unitPrice;
        } else {
            return quantity * unitPrice * 0.5;
        }
    }

    @Override
    public String getType() { return "Giao khoa"; }

    @Override
    public String toString() {
        return super.toString() + String.format(" %8s %,12.0f", condition, totalPrice());
    }
}
