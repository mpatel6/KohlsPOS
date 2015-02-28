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
public class Receipt {
    private Customer customer;
    private LineItem[] lineitem;

    public Receipt(String customerId, DatabaseStrategy db) {
       this.customer = db.findCustomerById(customerId);
       
    }

    
    
    
    public void addLineItem(){
        
    }
    
}
