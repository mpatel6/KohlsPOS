/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlspos;

import java.text.DecimalFormat;

/**
 *
 * @author mpatel6
 */
public class Receipt {

    private Customer customer;
    private LineItem[] lineItem = new LineItem[0];
    private int arrayIndex = 0;
    private final double SALESTAXRATE = 0.051;

    public Receipt() {
    }

    public Receipt(final String customerId, final DatabaseStrategy db) {
        this.customer = db.findCustomerById(customerId);

    }

    public void addLineItem(final String productId, final DatabaseStrategy db, final int itemQuantity) {

        LineItem[] temp = new LineItem[lineItem.length + 1];
        System.arraycopy(lineItem, 0, temp, 0, lineItem.length);
        temp[lineItem.length] = new LineItem(productId, db, itemQuantity);
        lineItem = temp;
        arrayIndex++;
    }

    private double subTotalAmount() {
        double grandTotal = 0;
        for (int i = 0; i < arrayIndex; i++) {
            grandTotal += lineItem[i].getLineSubtotal();

        }
        return grandTotal;
    }

    private double salesTaxAmount() {
        return subTotalAmount() * SALESTAXRATE;
    }

    public String getReceipt() {
        String lineItems = new String();
        for (int i = 0; i < arrayIndex; i++) {

            lineItems += lineItem[i].toString() + "\n";
        }

        DecimalFormat formatter = new DecimalFormat("#0.00");

        String str;
        str = "\t\t\t\t\t\tKOHL's" + "\n" + "ID# "
                + customer.getCustomerId() + ": "
                + customer.getCustomerName() + "\n\n"
                + "ID\t\tProduct Description\tQty\t\t\tDsct\t\t\tTotal\n"
                + lineItems + "\t\t\t\t\t\t\t\t\tSUBTOTAL        $"
                + formatter.format(subTotalAmount())
                + "\n\t\t\t\t\t\t\t\t\t5.1% TAX        $"
                + formatter.format(salesTaxAmount())
                + "\n\t\t\t\t\t\t\t\t\tTOTAL           $"
                + formatter.format(salesTaxAmount() + subTotalAmount());

        return str;
    }

}
