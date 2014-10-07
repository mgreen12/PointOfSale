package PointOfSale;

/**
 *
 * @author Max
 * @version 1.0
 */
public class Register {
    
    //Instantiate objects
    private Receipt receipt;

    //Creates a new receipt
    public void newSale(int customerId, DatabaseStrategy database) {
        receipt = new Receipt(customerId, database);
    }

    //Adds item to the sale
    public void addItemToSale(int quantity, int itemNumber) {
        receipt.addLineItem(quantity, itemNumber);
    }
    
    //Calls Receipt to print the receipt
    public void printReceipt() {
        receipt.printReceipt();
    }
    
}
