package PointOfSale;

/**
 *
 * @author Max
 */
public class NoDiscount implements DiscountStrategy {
    
    @Override
    public double getDiscount(double price) {
        return price;
    }
    
}
