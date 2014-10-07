package PointOfSale;

/**
 *
 * @author mgreen12
 */
public class FlatRateDiscount implements DiscountStrategy{

    @Override
    public double getDiscount(double price) {
        return (price - 10);
    }
    
}
