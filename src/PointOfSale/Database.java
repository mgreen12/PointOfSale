package PointOfSale;

/**
 *
 * @author Max
 */
public class Database implements DatabaseStrategy {
    
    private Customer[] customerArray = {new Customer("Adam", 10000),
            new Customer("Adam", 10001),
            new Customer("Bob", 10002),
            new Customer("Carol", 10003),
            new Customer("Dennis", 10004),
            new Customer("Elizabeth", 10005)
    };
    
    @Override
    public Customer searchForCustomer(int customerId) {
        
        Customer customer = null;
        
        for (Customer arraySearch : customerArray){
            if(customerId == arraySearch.getCustomerId()){
                customer = arraySearch;
                break;
            }
        }
        return customer;
    }

    private Product[] productArray = {new Product(112233, "Men's Shirt", 9.99, new PercentageDiscount()),
        new Product(223344, "Women's Shirt", 9.99, new PercentageDiscount()),
        new Product(123456, "Shoes", 39.99, new FlatRateDiscount()),
        new Product(765432, "Heels", 44.99, new FlatRateDiscount()),
        new Product(121212, "Packers Jersey", 59.99, new FlatRateDiscount()),
        new Product(888888, "Skittles", .99, new NoDiscount()),
        new Product(445566, "Greeting Card", 4.99, new PercentageDiscount())
    };
    
    @Override
    public Product searchForProduct(int itemNumber) {
        
        Product product = null;
        
        for (Product arraySearch : productArray){
            if(itemNumber == (arraySearch.getItemNumber())){
                product = arraySearch;
                break;
            }
        }
        return product;
    }
    
}
