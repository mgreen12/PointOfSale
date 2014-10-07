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
    
    // Add validation, javadoc
    public Product(int itemNumber, String description, double price) {
        this.itemNumber = itemNumber;
        this.description = description;
        this.price = price;
    }
    
    public double getPrice() {
     return price;   
    }
    
}
