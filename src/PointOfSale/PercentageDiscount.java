package PointOfSale;

/**
 *
 * @author Max
 */
public class PercentageDiscount implements DiscountStrategy{

    //Calculate discount of 20%
    @Override
    public double getDiscount(double price) {
        return (price * .80);
    }
    
}
