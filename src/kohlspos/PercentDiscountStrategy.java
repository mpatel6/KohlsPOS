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

    public PercentDiscountStrategy() {
    }

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

//    public static void main(String[] args) {
//        percentDiscount discount = new percentDiscount(0.1);
//        System.out.println(discount.getDiscountAmount(100.0, 2));
//    }
}
