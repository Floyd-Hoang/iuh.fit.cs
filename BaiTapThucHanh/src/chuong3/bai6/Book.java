/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 1:43:05 AM
 */

package chuong3.bai6;

/**
 * 
 */
public abstract class Book {
    protected String id;
    protected String pubDate; 
    protected double unitPrice;
    protected int quantity;
    protected String publisher;

    public Book(String id, String pubDate, double unitPrice, int quantity, String publisher) {
        this.id = id;
        this.pubDate = pubDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.publisher = publisher;
    }
    public String getId() { return id; }
    public String getPubDate() { return pubDate; }
    public double getUnitPrice() { return unitPrice; }
    public int getQuantity() { return quantity; }
    public String getPublisher() { return publisher; }

    public abstract double totalPrice();
    public abstract String getType();

    @Override
    public String toString() {
        return String.format("%-10s %-12s %,8.0f %6d %-20s", id, pubDate, unitPrice, quantity, publisher);
    }
}
