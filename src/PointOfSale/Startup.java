package PointOfSale;

/**
 *
 * @author Max
 * @version 1.0
 */

/** CHECK before final submission:
 * 
 * [ ] All methods have javadoc
 * [ ] All methods with parameters have validation
 * [ ] All variables/methods are camel-cased with NO beginning capital letter
 * [ ] CHANGE author on all classes to be the same (author changes from home PC to school PC between "Max" and "mgreen12")
 * 
*/

public class Startup {
    
    public static void main(String[] args) {
        
        //Start a new sale
        Register register = new Register();
        register.newSale(1, new Database());
        
        //Add items to the sale
        register.addItemToSale(3, 112233);
        register.addItemToSale(1, 121212);
        register.addItemToSale(2, 123456);
        register.addItemToSale(1, 888888);
        
        //Total the sale and print receipt
        register.printReceipt();
    }
    
}
