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
public interface DatabaseStrategy {

    Customer findCustomerById(final String CustomerId);

    Product findProduct(final String productId);
    
}
