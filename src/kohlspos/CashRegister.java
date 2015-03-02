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
    private final ReceiptOutputStrategy outputReceipt;

    public CashRegister(final ReceiptOutputStrategy outputReceipt) {

        this.outputReceipt = outputReceipt;
    }

    public void startNewSale(final String customerId, final DatabaseStrategy db) {

        receipt = new Receipt(customerId, db);
    }

    public void addProduct(final String productId, final DatabaseStrategy db, final int itemQuantity) {
        itemIndex++;
        receipt.addLineItem(productId, db, itemQuantity);
    }

    public void endSale() {
        outputReceipt.outputReceipt(receipt);

    }

}
