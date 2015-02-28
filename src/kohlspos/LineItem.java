/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlspos;

/**
 *
 * @author Ankita
 */
public class LineItem {
    
    private Product product;
    private int itemQuantity;
    

//    public LineItem() {
//    }
    
    

    public LineItem(Product product, int itemQuantity) {
        this.product = product;
        this.itemQuantity = itemQuantity;
        
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

    
    
    public double getLineSubtotal(){
        return product.getUnitPrice()*itemQuantity-product.getDiscountAmount(itemQuantity);
    }
    
    
    
}
