package PointOfSale;

/**
 *
 * @author mgreen12
 * @version 1.0
 */
public class Product {
    private int prodId;
    private String description;
    private double price;
    
    // Add validation, javadoc
    public Product(int prodId, String description, double price) {
        this.prodId = prodId;
        this.description = description;
        this.price = price;
    }
    
}
