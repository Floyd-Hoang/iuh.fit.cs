/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 1:44:44 AM
 */

package chuong3.bai6;

/**
 * 
 */
import java.util.*;

public class BookManager {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) { books.add(b); }

    public void displayAll() {
        System.out.printf("%-10s %-12s %-10s %-6s %-20s %-10s %-10s %-12s\n",
            "ID", "Ngày Nhập", "Đơn giá", "Số lượng", "NXB", "Tình trạng", "Thuế", "Thành tiền");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        for (Book b : books) {
            System.out.println(b.toString());
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
    }

    public double totalPriceByType(String type) {
        double sum = 0;
        for (Book b : books) if (b.getType().equals(type)) sum += b.totalPrice();
        return sum;
    }

    public double avgUnitPriceRef() {
        double sum = 0; int count = 0;
        for (Book b : books)
            if (b instanceof ReferenceBook) {
                sum += b.getUnitPrice();
                count++;
            }
        return count > 0 ? sum / count : 0;
    }

    public void printTextbooksByPublisher(String publisher) {
        for (Book b : books)
            if (b instanceof Textbook && b.getPublisher().equalsIgnoreCase(publisher))
                System.out.println(b);
    }
}

