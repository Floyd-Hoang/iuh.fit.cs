/**
 * @description: 
 * @author: 
 * @version: 1.0
 * @created: 11-Oct-2025 9:00:33 PM
 */

package chuong3.bai7;

/**
 * 
 */
import java.util.Date;

public class CurrencyTransaction extends Transaction {
    private String currencyType; 
    private double exchangeRate; 

    public CurrencyTransaction(String transactionID, Date transactionDate,
                               double unitPrice, double quantity,
                               String currencyType, double exchangeRate) {
        super(transactionID, transactionDate, unitPrice, quantity);
        this.currencyType = currencyType;
        this.exchangeRate = exchangeRate;
    }

    @Override
    public double getTotalAmount() {
        if (currencyType.equalsIgnoreCase("USD") ||
            currencyType.equalsIgnoreCase("EUR")) {
            return quantity * unitPrice * exchangeRate;
        }
        return quantity * unitPrice;
    }

    @Override
    public String getType() {
        return "Tiền tệ";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %-10s %-5s %,15.0f",
            getType(), currencyType, getTotalAmount());
    }
}
