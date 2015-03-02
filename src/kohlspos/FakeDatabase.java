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
        new Product("A100", "Men's Socks ", 20.5, new PercentDiscountStrategy(0.10)),
        new Product("B200", "Dress Shirt ", 50.0, new QuantityDiscountStrategy(2, 5)),
        new Product("C300", "Men's Shorts ", 10.0, new NoDiscountStrategy()),
        new Product("D400", "Dress Pants ", 50.0, new NoDiscountStrategy())
    };

    @Override
    public final Customer findCustomerById(final String CustomerId) {

        if (CustomerId == null || CustomerId.length() == 0) {
            //Throw exception for illegal customer ID
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
            //Throw exception for illegal product ID
            return null;
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
