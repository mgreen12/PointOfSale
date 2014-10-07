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
public class StoreInfo {
    
    private String storeName;
    private String storeNumber;
    private String storeAddress = "123 Main St";
    private String city = "Cityville";
    private String state = "Wisconsin";
    private int zipCode = 98765;

    public String getStoreName() {
        return storeName;
    }

    public String getStoreNumber() {
        return storeNumber;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }
    
}
