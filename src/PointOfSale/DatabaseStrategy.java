package PointOfSale;

/**
 *
 * @author Max
 */
public interface DatabaseStrategy {
    
    public abstract Customer searchForCustomer(int customerId);
    
    public abstract Product searchForProduct(int productNumber);
    
}
