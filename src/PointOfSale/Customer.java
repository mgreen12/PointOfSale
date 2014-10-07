package PointOfSale;

/**
 *
 * @author Max
 */
public class Customer {
    
    private String customerName;
    private int customerId;
    
    //Customer constructor
    public Customer(String customerName, int customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    //Return customerName
    public String getCustomerName() {
        return customerName;
    }

    //Return customerId
    public int getCustomerId() {
        return customerId;
    }
    
}
