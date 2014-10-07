package PointOfSale;

/**
 *
 * @author Max
 * @version 1.0
 */
public class LineItem {
    
    private int quantity;
    
    private DatabaseStrategy database;
    private Product product;
    
    public LineItem(int itemNumber, int quantity, DatabaseStrategy database) {
        this.database = database;
        this.quantity = quantity;
        product = database.searchForProduct(itemNumber);
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public double getProductPrice() {
        return product.getPrice();
    }
    
    //DISCOUNT
    public double getLineSubTotal() {
        return (product.getPrice() * quantity);
    }
    
}
