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
public class CashRegister {

    private Receipt receipt;
    private int itemIndex = 0;
    private ReceiptOutputStrategy outputReceipt;

    public CashRegister(ReceiptOutputStrategy outputReceipt) {

        this.outputReceipt = outputReceipt;
    }

    public void startNewSale(String customerId, DatabaseStrategy db) {

        receipt = new Receipt(customerId, db);
    }

    public void addProduct(String productId, DatabaseStrategy db, int itemQuantity) {
        itemIndex++;
        receipt.addLineItem(productId, db, itemQuantity);
    }

    public void endSale() {
        outputReceipt.outputReceipt(receipt);

    }

}
