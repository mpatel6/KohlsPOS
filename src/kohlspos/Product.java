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
public class Product {

    private String productId;
    private String productDescription;
    private double unitPrice;
    private ProductDiscountStrategy discount;

    public Product() {
    }

    public Product(String productId, String productDescription, double unitPrice, ProductDiscountStrategy discount) {
//        this.productId = productId;
//        this.productDescription = productDescription;
//        this.unitPrice = unitPrice;
        setProductId(productId);
        setProductDescription(productDescription);
        setUnitPrice(unitPrice);
        this.discount = discount;

    }

    public double getDiscountAmount(int unitQuantity) {
        return discount.getDiscountAmount(unitPrice, unitQuantity);
    }

//    public ProductDiscountStrategy getDiscount() {
//        return discount;
//    }
//
//    public void setDiscount(ProductDiscountStrategy discount) {
//        this.discount = discount;
//    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

}