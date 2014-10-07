package PointOfSale;

/**
 *
 * @author Max
 * @version 1.0
 */
public class Product {
    
    //Instantiate variables
    private int itemNumber;
    private String description;
    private double price;
    
    //Instantiate objects
    private DiscountStrategy discount;
    
    //Product constructor
    public Product(int itemNumber, String description, double price, DiscountStrategy discount) {
        this.itemNumber = itemNumber;
        this.description = description;
        this.price = price;
        this.discount = discount;
    }
    
    //Return price
    public double getPrice() {
        return price;
    }
    
    //Return description
    public String getDescription() {
        return description;
    }
    
    //Return item number
    public int getItemNumber() {
        return itemNumber;
    }
    
    //Calls discount object and returns the discount
    public double getDiscount() {
        return discount.getDiscount(price);
    }
    
}