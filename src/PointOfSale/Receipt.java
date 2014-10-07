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
    private double subTotalWithTax;
    private static int transactionNumber; //Increment by 1 every new transaction
    
    //Instantiate objects
    private Customer customer;
    private DatabaseStrategy database;
    StoreInfo store = new StoreInfo();
    private LineItem[] lineItems = new LineItem[0];
    
    public Receipt(int customerId, DatabaseStrategy database) {
        this.database = database;
        customer = database.searchForCustomer(customerId);
        transactionNumber++;
    }
    
    //Add parameters, javadoc
    public void addLineItem(int quantity, int itemNumber) {
        LineItem lineItem = new LineItem(itemNumber, quantity, database);
        addToArray(lineItem);
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
        System.out.println("\n\t" + store.getStoreName() + " #" + store.getStoreNumber() + "\n\t" + store.getStoreAddress() + "\n" + store.getCity() + ", " + store.getState() + " " + store.getZipCode() + "\n");
        //Date      time    transactionNumber   customerId
        System.out.println("******************************");
        
        for(LineItem lineItem : lineItems) {
            if(lineItem.getQuantity() == 1) {
                System.out.println(lineItem.getItemNumber() + " " + lineItem.getDesciption() + " " + lineItem.getLineSubTotal());
            }
            else {
                System.out.println(lineItem.getItemNumber() + " " + lineItem.getDesciption() + "\n\t" + lineItem.getQuantity() + " @ " + lineItem.getProductPrice() + "\t" + lineItem.getLineSubTotal());
            }
            subTotal += lineItem.getLineSubTotal();
        }
        
        subTotalWithTax = (salesTax * subTotal);
        grandTotal = (subTotal + subTotalWithTax);
        System.out.println("******************************");
        System.out.format("\t\tSubtotal: $" + subTotal + "\n\t\tTax +" + subTotalWithTax + "\n\t\tTotal: $" + grandTotal);
        //                              subTotal
        //                                  +Tax
        //                            grandTotal
        //
        System.out.println("\n\nThank you for shopping at " + store.getStoreName() + ", we look forward to seeing you again and have a nice day!");
    }
    
}
