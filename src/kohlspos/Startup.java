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
public class Startup {

    public static void main(String[] args) {

        ProductDiscountStrategy discount = new PercentDiscountStrategy(0.05);

        Product prod1 = new Product("A010", "Pen", 200, discount);

        System.out.println(prod1.getDiscountAmount(2));

    }

}
