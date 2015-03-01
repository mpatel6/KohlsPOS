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
public class FakeDatabase implements DatabaseStrategy {

    private Customer[] customers = {
        new Customer("100", "Monil Patel"),
        new Customer("200", "Ankita Patel"),
        new Customer("300", "Ravi Patel")
    };

    private Product[] products = {
        new Product("A101", "MLB Brewer's Hat ", 20.5, new PercentDiscountStrategy(0.10)),
        new Product("B205", "Men's Dress Shirt", 50.0, new QuantityDiscountStrategy(2, 5)),
        new Product("C222", "Women's Socks    ", 10.0, new NoDiscountStrategy())
    };

    @Override
    public final Customer findCustomerById(final String CustomerId) {

        if (CustomerId == null || CustomerId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findCustomer method has "
                    + "illegal argument");
            return null;
        }

        Customer customer = null;
        for (Customer c : customers) {
            if (CustomerId.equals(c.getCustomerId())) {
                customer = c;
                break;
            }
        }

        return customer;
    }

    @Override
    public final Product findProduct(final String productId) {

        if (productId == null || productId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findProduct method has "
                    + "illegal argument");
            return null;  // end method prematurely after log to console
        }

        Product product = null;
        for (Product p : products) {
            if (productId.equals(p.getProductId())) {
                product = p;
                break;
            }
        }

        return product;
    }

}
