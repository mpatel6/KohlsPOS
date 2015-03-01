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
        
        CashRegister cr = new CashRegister();
        cr.startNewSale("100",db);
        cr.addProduct("A101",db,4);
          cr.addProduct("B205",db,6);
          cr.addProduct("C222",db,7);
        cr.endSale();



    }

}
