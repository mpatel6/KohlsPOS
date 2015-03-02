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

        DatabaseStrategy db = new FakeDatabase();
        ReceiptOutputStrategy output = new ReceiptConsoleOutputStrategy();
        
        CashRegister cr = new CashRegister(output);
        cr.startNewSale("100", db);
        cr.addProduct("A100", db, 4);
        cr.addProduct("B200", db, 6);
        cr.addProduct("C300", db, 7);
        cr.addProduct("D400", db, 2);
        cr.endSale();
        
        
        ReceiptOutputStrategy output2 = new ReceiptGUIOutputStrategy();
        CashRegister cr2 = new CashRegister(output2);
        cr2.startNewSale("100", db);
        cr2.addProduct("A100", db, 2);
        cr2.addProduct("B200", db, 3);
        cr2.addProduct("C300", db, 4);
        cr2.addProduct("D400", db, 5);
        cr2.endSale();

    }

}
