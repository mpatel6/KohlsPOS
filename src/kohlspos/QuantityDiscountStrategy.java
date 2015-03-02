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
public class QuantityDiscountStrategy implements ProductDiscountStrategy {

    private int minQuantity;
    private double qtyDiscountAmount;

    public QuantityDiscountStrategy(final int minQuantity, final double qtyDiscountAmount) {
        this.minQuantity = minQuantity;
        this.qtyDiscountAmount = qtyDiscountAmount;
    }

    public int getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(final int minQuantity) {
        this.minQuantity = minQuantity;
    }

    public double getQtyDiscountAmount() {
        return qtyDiscountAmount;
    }

    public void setQtyDiscountAmount(final double qtyDiscountAmount) {
        this.qtyDiscountAmount = qtyDiscountAmount;
    }

    /**
     *
     * @param unitPrice
     * @param unitQuantity
     * @return
     */
    @Override
    public double getDiscountAmount(final double unitPrice, final int unitQuantity) {
        if (unitQuantity < minQuantity) {
            return 0;
        } else {
            return qtyDiscountAmount * unitQuantity;
        }
    }

}
