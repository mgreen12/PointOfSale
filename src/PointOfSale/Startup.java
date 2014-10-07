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
        
        Register register = new Register();
        register.newSale(1, new Database()); // Add arguments
    }
    
}
