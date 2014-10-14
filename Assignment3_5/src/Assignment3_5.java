
public class Assignment3_5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create integer counter
        int counter=1;
        
        //add 1 each time the integer is less than 100
        do {
            System.out.print(counter + " "); 
            counter = counter+ 1;
          
            // Print number if we have not reached 100  
        } while (counter < 101);
                 
   
    }
}