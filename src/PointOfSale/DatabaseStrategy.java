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
public interface DatabaseStrategy {
    
    public abstract Customer searchForCustomer(int customerId);
    
    public abstract Product searchForProduct(int productNumber);
    
}
