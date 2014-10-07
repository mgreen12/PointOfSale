package PointOfSale;

/**
 *
 * @author Max
 */
public interface DatabaseStrategy {
    
    //Method to be overridden to search for customer
    public abstract Customer searchForCustomer(int customerId);
    
    //Method to be overridden to search for product
    public abstract Product searchForProduct(int productNumber);
    
}
