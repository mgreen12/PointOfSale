package PointOfSale;

/**
 *
 * @author mgreen12
 */
public interface DiscountStrategy {
    
    //Method to be overridden to calculate the discount price
    public abstract double getDiscount(double price);
    
}
