
/**
 * The class Wearable has instance variable information about a wearable and has accessor methods to get this information.
 *
 * @author  Valerie Foster
 * @version 2/20/2018
 */
public class Wearable {
    
    // instance variables
    private int index;
    private int rank;
    private String name;
    private double price;
    private String bodyLocation;
    private String category;
    private String compName;
    private String compURL;
    private String compAddress;
    private String compCity;
    private String compState;
    private String compCountry;

    /**
     * Constructor for objects of class Wearable
     * 
     * @param   index           the index of this Wearable, an integer
     * @param   rank            the rank of this Wearable, an integer
     * @param   name            the name of this Wearable, a String
     * @param   price           the price of this Wearable, a double
     * @param   bodyLocation    the bodyLocation of this Wearable, a String
     * @param   category        the category of this Wearable, a String
     * @param   compName        the compName of this Wearable, a String
     * @param   compURL         the comURL of this Wearable, a String
     * @param   compAddress     the compAddress of this Wearable, a String
     * @param   compCity        the compCity of this Wearable, a String
     * @param   compState       the compState of this Wearable, a String
     * @param   compCountry     the compCountry of this Wearable, a String
     */
    public Wearable(int index, int rank, String name, double price, String bodyLocation, String category, String compName, String compURL, String compAddress, String compCity, String compState, String compCountry) {
        this.index = index;
        this.rank = rank;
        this.name = name;
        this.price = price;
        this.bodyLocation = bodyLocation;
        this.category = category;
        this.compName = compName;
        this.compURL = compURL;
        this.compAddress = compAddress;
        this.compCity = compCity;
        this.compState = compState;
        this.compCountry = compCountry;
    }

    /**
     * An accessor method - returns the index of the wearable
     *
     * @return    the index of this Wearable, an integer
     */
    public int getIndex() {
        return this.index;
    }

    /**
     * An accessor method - returns the rank of the wearable
     *
     * @return    the rank of this Wearable, an integer
     */
    public int getRank() {
        return this.rank;
    }
    
    /**
     * An accessor method - returns the descriptive name of the wearable
     *
     * @return    the name of this Wearable, a String
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * An accessor method - returns the price of the wearable, or -99.99 if the price is unknown
     *
     * @return    the price of this Wearable, a double
     */
    public double getPrice() {
        return this.price;
    }
    
    /**
     * An accessor method - returns the body location of the wearable
     *
     * @return    the bodyLocation of this Wearable, a String
     */
    public String getBodyLocation() {
        return this.bodyLocation;
    }
    
    /**
     * An accessor method - returns the category of the wearable
     *
     * @return    the category of this Wearable, a String
     */
    public String getCategory() {
        return this.category;
    }
    
    /**
     * An accessor method - returns the company name of the wearable
     *
     * @return    the compName of this Wearable, a String
     */
    public String getCompName() {
        return this.compName;
    }
    
    /**
     * An accessor method - returns the company URL of the wearable
     *
     * @return    the compURL of this Wearable, a String
     */
    public String getCompURL() {
        return this.compURL;
    }
    
    /**
     * An accessor method - returns the company address of the wearable, of the form city, state (if applicable), country
     *
     * @return    the compAddress of this Wearable
     */
    public String getCompAddress() {
        return this.compAddress;
    }
    
    /**
     * An accessor method - returns the company city of the wearable
     *
     * @return    the compCity of this Wearable, a String
     */
    public String getCompCity() {
        return this.compCity;
    }
    
    /**
     * An accessor method - returns the company US state of the , or Non-US if  the comany is not in the United States
     *
     * @return    the compState of this Wearable
     */
    public String getCompState() {
        return this.compState;
    }
    
    /**
     * An accessor method - returns the comapy country of the wearable
     *
     * @return    the compCountry of this Wearable
     */
    public String getCompCountry() {
        return this.compCountry;
    }
    
    /** 
     * Creates and returns a string representation of this Wearable
     * 
     * @return  a String showing basic information about the wearable
     */
    @Override
    public String toString() {
        String str = "";
        str += "Rank: " + rank + ", Name: " + name + ", Price: ";
        if (price == -99.99) {
            str += "unknown";
        } else {
            str += price;
        }
        str += ", Body Location: " + bodyLocation + ", Category: " + category + "\n";
        str += "Company Name: " + compName + ", Company URL: " + compURL + ", Company Address: " + compAddress + "\n";
        return str;
    }
    
}
