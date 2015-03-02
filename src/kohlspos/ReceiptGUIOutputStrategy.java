/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlspos;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Ankita
 */
public class ReceiptGUIOutputStrategy implements ReceiptOutputStrategy {

    @Override
    public void outputReceipt(final Receipt receipt) {
        JOptionPane.showMessageDialog(null, new JTextArea(receipt.getReceipt()));
    }

}
