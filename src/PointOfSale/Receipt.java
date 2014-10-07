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
    private double totalSavings;
    private static int transactionNumber; //Increment by 1 every new transaction
    
    //Instantiate objects
    private Customer customer;
    private DatabaseStrategy database;
    StoreInfo store = new StoreInfo();
    private LineItem[] lineItems = new LineItem[0];
    
    //Receipt constructor
    public Receipt(int customerId, DatabaseStrategy database) {
        this.database = database;
        customer = database.searchForCustomer(customerId);
        transactionNumber++;
    }

    //Adds items to the array
    public void addLineItem(int quantity, int itemNumber) {
        LineItem lineItem = new LineItem(itemNumber, quantity, database);
        addToArray(lineItem);
    }

    //Resize LineItem array, credit goes to code off Blackboard
    public void addToArray(LineItem lineItem) { 
        LineItem[] copyArray = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, copyArray, 0, lineItems.length);
        copyArray[lineItems.length] = lineItem;
        lineItems = copyArray;
    }
    
    //Prints the receipt to console
    public void printReceipt() {
        
        System.out.println("\n\t" + store.getStoreName() + " #" + store.getStoreNumber() + "\n\t" + store.getStoreAddress() + "\n" + store.getCity() + ", " + store.getState() + " " + store.getZipCode() + "\n");
        System.out.println("******************************");
        
        for(LineItem lineItem : lineItems) {
            
            if(lineItem.getDiscount() < lineItem.getProductPrice()) {
                //has a discount and one item
                if(lineItem.getQuantity() == 1) {
                    System.out.println(lineItem.getItemNumber() + " " + lineItem.getDesciption() + "\n\tDiscount: -" + (lineItem.getProductPrice() - lineItem.getDiscount()) + "\n\t\t\t" + lineItem.getLineSubTotal());
                }
                //has a discount for multiple items
                else {
                    System.out.println(lineItem.getItemNumber() + " " + lineItem.getDesciption() + "\n\t" + lineItem.getQuantity() + " @ " + lineItem.getProductPrice() + "\n\tDiscount: -" + lineItem.getQuantity() * (lineItem.getProductPrice() - lineItem.getDiscount()) + "\n\t\t\t" + lineItem.getLineSubTotal());
                }
            }
            else {
                //no discount and one item
                if(lineItem.getQuantity() == 1) {
                    System.out.println(lineItem.getItemNumber() + " " + lineItem.getDesciption() + "\t\t" + lineItem.getLineSubTotal());
                }
                //no discount and multiple items
                else {
                    System.out.println(lineItem.getItemNumber() + " " + lineItem.getDesciption() + "\n\t" + lineItem.getQuantity() + " @ " + lineItem.getProductPrice() + "\t" + lineItem.getLineSubTotal());
                }
            }
            subTotal += lineItem.getLineSubTotal();
            totalSavings += lineItem.getQuantity() * (lineItem.getProductPrice() - lineItem.getDiscount());
        }
        
        subTotalWithTax = (salesTax * subTotal);
        grandTotal = (subTotal + subTotalWithTax);
        
        System.out.println("******************************");
        System.out.format("\t\tSubtotal: $" + subTotal + "\n\t\tTax: +" + subTotalWithTax + "\n\t\tTotal: $" + grandTotal);
        System.out.println("\n\n\tTotal savings: $" + totalSavings);
        System.out.println("\n\nThank you for shopping at " + store.getStoreName() + ", we look forward to seeing you again and have a nice day!");
    }
    
}