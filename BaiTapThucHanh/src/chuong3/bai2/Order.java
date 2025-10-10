/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 10-Oct-2025 7:37:30 PM
 */

package chuong3.bai2;

/**
 * 
 */
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Order {
    private int orderID;
    private Date orderDate;
    private ArrayList<OrderDetail> lineItems;

    public Order(int orderID, Date orderDate) {
        this.orderID   = orderID;
        this.orderDate = orderDate;
        this.lineItems = new ArrayList<>();
    }

    public int getOrderID() {
        return orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void addLineItem(Product p, int q) {
        lineItems.add(new OrderDetail(p, q));
    }

    public double calcTotalCharge() {
        double total = 0;
        for (OrderDetail od : lineItems) {
            total += od.calcTotalPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        sb.append(String.format("Mã HD: %-5d Ngày: %s%n", orderID, fmt.format(orderDate)));
        sb.append(String.format("%-4s| %-6s| %-12s| %-10s| %-8s| %-12s%n",
                "STT", "Mã SP", "Mô tả", "Đơn giá", "Số lượng", "Thành tiền"));
        sb.append("-------------------------------------------------------------\n");
        for (int i = 0; i < lineItems.size(); i++) {
            OrderDetail od = lineItems.get(i);
            Product p = od.getProduct();
            sb.append(String.format("%-4d| %-6s| %-12s| %10.0f| %8d| %12.0f%n",
                    i + 1,
                    p.getProductID(),
                    p.getDescription(),
                    p.getPrice(),
                    od.getQuantity(),
                    od.calcTotalPrice()
            ));
        }
        sb.append("-------------------------------------------------------------\n");
        sb.append(String.format("Tổng thành tiền thanh toán: %,12.0f VND%n", calcTotalCharge()));
        return sb.toString();
    }

}

