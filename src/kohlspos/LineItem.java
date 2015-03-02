/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlspos;

import java.text.DecimalFormat;

/**
 *
 * @author Ankita
 */
public class LineItem {

    private Product product;
    private int itemQuantity;

//    public LineItem() {
//    }
    public LineItem(String productId, DatabaseStrategy db, int itemQuantity) {
        this.product = db.findProduct(productId);
        this.itemQuantity = itemQuantity;

     //   this.customer = db.findCustomerById(customerId);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getLineSubtotal() {
        return product.getUnitPrice() * itemQuantity - product.getDiscountAmount(itemQuantity);
    }

    @Override
    public String toString() {
        String str;
        DecimalFormat formatter = new DecimalFormat("#0.00");
        //str = String.format("%-20s %s",product.getProductId(),product.getProductDescription(),itemQuantity,formatter.format(product.getDiscountAmount(itemQuantity)),formatter.format(getLineSubtotal()));
        str = product.getProductId() + "\t\t" + product.getProductDescription() + "\t\t" + itemQuantity + "\t\t\t" + formatter.format(product.getDiscountAmount(itemQuantity)) + "\t\t\t" + formatter.format(getLineSubtotal());
        return str;
    }

}
