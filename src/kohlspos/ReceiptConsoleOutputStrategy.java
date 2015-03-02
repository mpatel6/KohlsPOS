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
public class ReceiptConsoleOutputStrategy implements ReceiptOutputStrategy {
    
    @Override
    public void outputReceipt(Receipt receipt){
        System.out.println(receipt.getReceipt());
    }
    
}
