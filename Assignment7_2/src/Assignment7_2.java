
public class Assignment7_2 {
    class Stock {
        /** symbol field for a stock object's symbol */
        String symbol;
        
        /** name field for a stock object's name */
        String name;
        
        /**price for the previous day */
        double previousClosingPrice;
        
        /**price for the current time */
        double currentPrice;
        
        /** construct a stock object */
        Stock(String newSymbol, String newName) {
            symbol = newSymbol;
            name = newName;
        }
        
        /** Return percentage changed from closing to current price */
        double getChangePercent() {
            return ((previousClosingPrice-currentPrice)/previousClosingPrice);
        }
        
    }
    
}
