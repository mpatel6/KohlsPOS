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

    public PercentDiscountStrategy(double percent) {
        setPercent(percent);
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public double getDiscountAmount(double unitPrice, int unitQuantity) {
        return percent * unitPrice * unitQuantity;
    }

}
