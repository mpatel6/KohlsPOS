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
public class NoDiscountStrategy implements ProductDiscountStrategy{
    
    

    @Override
    public double getDiscountAmount(double unitPrice, int unitQuantity) {
        return 0;
    }
    
    
    
}
