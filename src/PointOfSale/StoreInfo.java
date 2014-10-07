package PointOfSale;

/**
 *
 * @author Max
 */
public class StoreInfo {
    
    //Instantiate variables for the store's information
    private String storeName = "Kohl's";
    private String storeNumber = "117";
    private String storeAddress = "123 Main St.";
    private String city = "Cityville";
    private String state = "Wisconsin";
    private int zipCode = 98765;
    
    //Return store name
    public String getStoreName() {
        return storeName;
    }
    
    //Return store number
    public String getStoreNumber() {
        return storeNumber;
    }

    //Returns the store's address
    public String getStoreAddress() {
        return storeAddress;
    }

    //Returns the city
    public String getCity() {
        return city;
    }

    //Return the state
    public String getState() {
        return state;
    }

    //Return the zipcode
    public int getZipCode() {
        return zipCode;
    }
    
}
