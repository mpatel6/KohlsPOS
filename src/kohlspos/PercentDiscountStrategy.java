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
public class PercentDiscountStrategy implements ProductDiscountStrategy {

    private double percent;

    public PercentDiscountStrategy(final double percent) {
        setPercent(percent);
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(final double percent) {
        this.percent = percent;
    }

    @Override
    public double getDiscountAmount(final double unitPrice, final int unitQuantity) {
        return percent * unitPrice * unitQuantity;
    }

}
