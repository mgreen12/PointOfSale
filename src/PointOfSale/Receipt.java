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
    private double salesTax = 0.051; //Waukesha sales tax
    private static int transactionNumber; //Increment by 1 every new transaction
    
    //Instantiate objects
    private Customer customer;
    private DatabaseStrategy database;
    private StoreInfo storeInfo;
    private LineItem[] lineItems = new LineItem[0];
    
    public Receipt(int customerId, DatabaseStrategy database) {
        this.database = database;
        customer = database.searchForCustomer(customerId);
        transactionNumber++;
    }
    
    //Add parameters, javadoc
    public void addLineItem(int quantity, int itemNumber) {
        LineItem lineItem = new LineItem(itemNumber, quantity, database); //Add parameters
    }
    
    //Add javadoc
    //Resize LineItem array, credit goes to code off Blackboard
    public void addToArray(LineItem lineItem) { 
        LineItem[] copyArray = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, copyArray, 0, lineItems.length);
        copyArray[lineItems.length] = lineItem;
        lineItems = copyArray;
    }
    
    public void printReceipt() {
        //Prints the receipt:
        //
        //        StoreInfo
        //Date      time    transactionNumber
        //====================================
        //itemNumber    description     subTotalPrice      (for single line item, if more than 1 add next line)
        //      quantity @ price        subTotalPrice
        //====================================
        //                              subTotal
        //                                  +Tax
        //                            grandTotal
        //
        //Thank you for shopping at storeInfo.name(), we look forward to seeing you again and have a nice day!
    }
    
}
