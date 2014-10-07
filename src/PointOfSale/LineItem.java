package PointOfSale;

/**
 *
 * @author Max
 * @version 1.0
 */
public class LineItem {
    
    //Instantiate variable
    private int quantity;

    //Instantiate objects
    private DatabaseStrategy database;
    private Product product;
    
    //LineItem constructor
    public LineItem(int itemNumber, int quantity, DatabaseStrategy database) {
        this.database = database;
        this.quantity = quantity;
        product = database.searchForProduct(itemNumber);
    }
    
    //Return quantity
    public int getQuantity() {
        return quantity;
    }
    
    //Calls Product and returns the price
    public double getProductPrice() {
        return product.getPrice();
    }
    
    //Calls Product and returns the description
    public String getDesciption() {
        return product.getDescription();
    }
    
    //Calls Product and returns the item number
    public int getItemNumber() {
        return product.getItemNumber();
    }

    //Calls Product and returns the subtotal for item(s)
    public double getLineSubTotal() {
        return (product.getDiscount() * quantity);
    }
    
    //Calls Product and returns the discount
    public double getDiscount() {
        return product.getDiscount();
    }
}
