package PointOfSale;

/**
 *
 * @author mgreen12
 */
public class PercentageDiscount implements DiscountStrategy{

    @Override
    public double getDiscount(double price) {
        return (price * .80);
    }
    
}
