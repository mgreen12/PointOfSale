package PointOfSale;

/**
 *
 * @author Max
 * @version 1.0
 */
public class Receipt {
    
    //Instantiate variables
    private double subTotal = 0;
    private double grandTotal = 0;
    private double salesTax = 0.051;
    private static int transactionNumber;
    
    //Instantiate objects
    private Customer customer;
    private DatabaseStrategy database;
    private StoreInfo storeInfo;
    private LineItem[] lineItems = new LineItem[0];
    
    public Receipt(int customerId, DatabaseStrategy database) {
        this.database = database;
    }
    
    //Add parameters, javadoc
    public void addLineItem() {
        LineItem lineItem = new LineItem(); //Add parameters
    }
    
    //Add javadoc
    //Resize LineItem array, credit goes to code off Blackboard
    public void addToArray(LineItem lineItem) { 
        LineItem[] copyArray = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, copyArray, 0, lineItems.length);
        copyArray[lineItems.length] = lineItem;
        lineItems = copyArray;
    }
    
}
