
/**
 * Write a description of class Main here.
 *
 * @author  Valerie Foster
 * @version 2/20/2018
 */
public class Main {
    
    public static void main(String[] args) {
        
        Wearables wear = new Wearables();
        
        int[] rankArr = wear.getDataByRank();
        System.out.println(wear.getRankReport(rankArr));
        
        int[] priceArr = wear.getDataByPrice();
        int[] expensive = new int[1];
        expensive[0] = priceArr[581];
        System.out.println(wear.getPriceReport(expensive));
        
    }
    
}
