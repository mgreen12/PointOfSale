package PointOfSale;

/**
 *
 * @author mgreen12
 */
public interface DiscountStrategy {
    
    public abstract double getDiscount(double price);
    
}
