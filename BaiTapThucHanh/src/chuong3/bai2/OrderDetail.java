/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 10-Oct-2025 7:28:02 PM
 */

package chuong3.bai2;

/**
 * 
 */
public class OrderDetail {
    private Product product;
    private int quantity;

    public OrderDetail(Product product, int quantity) {
        this.product  = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calcTotalPrice() {
        return quantity * product.getPrice();
    }

    @Override
    public String toString() {
        return String.format("%s | %5d | %, .2f", 
            product.toString(), quantity, calcTotalPrice());
    }
}
