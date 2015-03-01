/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlspos;

/**
 *
 * @author mpatel6
 */
public class Receipt {

    private Customer customer;
    private LineItem[] lineItem = new LineItem[3];
    private int arrayIndex = 0;

    public Receipt() {
    }

    public Receipt(String customerId, DatabaseStrategy db) {
        this.customer = db.findCustomerById(customerId);

    }

    public void addLineItem(String productId, DatabaseStrategy db, int itemQuantity) {

        lineItem[arrayIndex] = new LineItem(productId, db, itemQuantity);
        arrayIndex++;
    }

    public String getCustomerId() {
        return customer.getCustomerId();
    }

    public double grandTotal() {
        double grandTotal = 0;
        for (int i = 0; i < arrayIndex; i++) {
            grandTotal += lineItem[i].getLineSubtotal();

        }
        return grandTotal;
    }

    public String getLineItem(int itemIndex) {

        return lineItem[itemIndex].toString();

    }

}
