package kohlspos;

public class Product {

    private String productId;
    private String productDescription;
    private double unitPrice;
    private ProductDiscountStrategy discount;

    /**
     *
     * @param productId
     * @param productDescription
     * @param unitPrice
     * @param discount
     */
    public Product(final String productId, final String productDescription, final double unitPrice, final ProductDiscountStrategy discount) {

        setProductId(productId);
        setProductDescription(productDescription);
        setUnitPrice(unitPrice);
        this.discount = discount;

    }

    public double getDiscountAmount(final int unitQuantity) {
        return discount.getDiscountAmount(unitPrice, unitQuantity);
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(final String productDescription) {
        this.productDescription = productDescription;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(final double unitPrice) {
        this.unitPrice = unitPrice;
    }

}
