package kohlspos;

public class Product {

    private String productId;
    private String productDescription;
    private double unitPrice;
    private ProductDiscountStrategy discount;

    public Product(String productId, String productDescription, double unitPrice, ProductDiscountStrategy discount) {

        setProductId(productId);
        setProductDescription(productDescription);
        setUnitPrice(unitPrice);
        this.discount = discount;

    }

    public double getDiscountAmount(int unitQuantity) {
        return discount.getDiscountAmount(unitPrice, unitQuantity);
    }

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
