package PointOfSale;

/**
 *
 * @author Max
 * @version 1.0
 */
public class Register {
    
    private Receipt receipt;
    
    // Add javadoc
    public void newSale(int customerId, DatabaseStrategy database) {
        receipt = new Receipt(customerId, database);
    }
    
    // Add javadoc
    public void addItemToSale(int quantity, int itemNumber) {
        receipt.addLineItem(quantity, itemNumber);
    }
    
    public void printReceipt() {
        receipt.printReceipt();
    }
    
}
