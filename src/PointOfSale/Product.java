package PointOfSale;

/**
 *
 * @author mgreen12
 * @version 1.0
 */
public class Product {
    
    private int itemNumber;
    private String description;
    private double price;
    
    private DiscountStrategy discount;
    
    public Product(int itemNumber, String description, double price, DiscountStrategy discount) {
        this.itemNumber = itemNumber;
        this.description = description;
        this.price = price;
        this.discount = discount;
    }
    
    public double getPrice() {
     return price;   
    }
    
    public String getDescription() {
        return description;
    }
    
    public int getItemNumber() {
        return itemNumber;
    }
    
    public double getDiscount() {
        return discount.getDiscount(price);
    }
    
}
