/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PointOfSale;

/**
 *
 * @author Max
 */
public class Customer {
    
    //All methods need javadoc
    
    private String customerName;
    private int customerId;
    
    public Customer(String customerName, int customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerId() {
        return customerId;
    }
    
}
