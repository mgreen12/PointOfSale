package PointOfSale;

/**
 *
 * @author mgreen12
 * @version 1.0
 */
public class Product {
    private int prodId;
    private String description;
    private double unitPrice;
    
    // Add validation, javadoc
    public Product(int prodId, String description, double unitPrice) {
        this.prodId = prodId;
        this.description = description;
        this.unitPrice = unitPrice;
    }
    
    public int getProdId() {
        return prodId;
    }
    
    public String getDescription() {
        return description;
    }
    
    public double getPrice() {
        return unitPrice;
    }
    
}
