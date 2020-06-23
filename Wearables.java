import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Write a description of class Wearables here.
 *
 * @author  Valerie Foster
 * @version 2/20/2018
 */
public class Wearables {
    
    private static final String FILE_NAME = "wearables.txt";
    
    // instance variables
    private Wearable[] wearArr;
    private int count;
    private BinaryTree<Integer> rankIndex;
    private KAryTree<Double> priceIndex;
    private KAryTree<String> compIndex;

    /**
     * Constructor for objects of class Wearables
     */
    public Wearables() {
        readFile();
        rankIndex = new BinaryTree<Integer>();
        for (int idx = 0; idx < count; idx++) {
            rankIndex.add(wearArr[idx].getRank(), wearArr[idx].getIndex());
        }
        priceIndex = new KAryTree<Double>();
        for (int idx = 0; idx < count; idx++) {
            priceIndex.add(wearArr[idx].getPrice(), wearArr[idx].getIndex());
        }
        compIndex = new KAryTree<String>();
        for (int idx = 0; idx < count; idx++) {
            compIndex.add(wearArr[idx].getCompName(), wearArr[idx].getIndex());
        }
    }

    /**
     * This method reads the information from the FILE_NAME String, and uses the first line to get a count, then uses split to break up all
     * the rest of the lines into the differnent parts of a wearable, and creates a wearable for each line and adds it to the wearable array
     */
    private void readFile() {
        try {
            Scanner input = new Scanner(new File(FILE_NAME));
            this.count = input.nextInt();
            wearArr = new Wearable[count];
            input.nextLine();
            input.nextLine();
            for (int idx = 0; idx < count; idx++) {
                String line = input.nextLine();
                String[] parts = line.split("@");
                wearArr[idx] = new Wearable(idx, Integer.parseInt(parts[0]), parts[1], Double.parseDouble(parts[2]), parts[3], parts[4], 
                                                parts[5], parts[6], parts[7], parts[8], parts[9], parts[10]);
            }
        } catch (FileNotFoundException e) {
        }
    }
    
    /**
     * This method uses the getPosData() method in the BinaryTree class to return an array of indexes for the wearable array ordered by rankings
     *
     * @return    an integer array of indexes
     */
    public int[] getDataByRank() {
        return rankIndex.getPosData();
    }
    
    /**
     * This method uses the getPosData() method in the BinaryTree class to return an array of indexes for the wearable array ordered by prices
     *
     * @return    an integer array of indexes
     */
    public int[] getDataByPrice() {
        return priceIndex.getPosData();
    }
    
    /**
     * This method uses the getPosData() method in the BinaryTree class to return an array of indexes for the wearable array ordered by company names
     *
     * @return    an integer array of indexes
     */
    public int[] getDataByCompany() {
        return compIndex.getPosData();
    }
    
    /**
     * This method takes in an array of indexes for the wearable array and returns a String with pertinent information
     * about the wearables at these indexes starting with the rank
     *
     * @param   positions   an integer array of indexes
     * @return              a String with wearable information
     */
    public String getRankReport(int[] positions) {
        String str = "";
        int posCount = positions.length;
        for (int ind = 0; ind < posCount; ind++) {
            int idx = positions[ind];
            str += wearArr[idx].getRank() + ", ";
            str += wearArr[idx].getPrice() + ", ";
            str += wearArr[idx].getCompName() + ", ";
            str += wearArr[idx].getName() + "\n";
        }
        return str;
    }
    
    /**
     * This method takes in an array of indexes for the wearable array and returns a String with pertinent information
     * about the wearables at these indexes starting with the price
     *
     * @param   positions   an integer array of indexes
     * @return              a String with wearable information
     */
    public String getPriceReport(int[] positions) {
        String str = "";
        int posCount = positions.length;
        for (int ind = 0; ind < posCount; ind++) {
            int idx = positions[ind];
            str += wearArr[idx].getPrice() + ", ";
            str += wearArr[idx].getRank() + ", ";
            str += wearArr[idx].getCompName() + ", ";
            str += wearArr[idx].getName() + "\n";
        }
        return str;
    }
    
    /**
     * This method takes in an array of indexes for the wearable array and returns a String with pertinent information
     * about the wearables at these indexes starting with company name
     *
     * @param   positions   an integer array of indexes
     * @return              a String with wearable information
     */
    public String getCompanyReport(int[] positions) {
        String str = "";
        int posCount = positions.length;
        for (int ind = 0; ind < posCount; ind++) {
            int idx = positions[ind];
            str += wearArr[idx].getCompName() + ", ";
            str += wearArr[idx].getRank() + ", ";
            str += wearArr[idx].getPrice() + ", ";
            str += wearArr[idx].getName() + "\n";
        }
        return str;
    }
    
}
