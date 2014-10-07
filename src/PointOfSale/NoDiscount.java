package PointOfSale;

/**
 *
 * @author Max
 */
public class NoDiscount implements DiscountStrategy {
    
    //Item is not elegible for a discount
    @Override
    public double getDiscount(double price) {
        return price;
    }
    
}
