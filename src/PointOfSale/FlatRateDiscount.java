package PointOfSale;

/**
 *
 * @author mgreen12
 */
public class FlatRateDiscount implements DiscountStrategy{

    //Calculates a flat rate discount of $10
    @Override
    public double getDiscount(double price) {
        return (price - 10);
    }
    
}
