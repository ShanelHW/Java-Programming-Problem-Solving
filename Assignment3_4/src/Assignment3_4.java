
public class Assignment3_4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create integer counter
        int counter;
        
        //for int counter start with value of 1 
        //add 1 each time the integer is less than 100
        for(counter = 1; counter <= 100; counter++) {  
        System.out.print(counter + "."); //print number
            // Print sentence with a new line after if we have not reached 100  
            if (counter < 101) {  
                System.out.println(" I will not quit Java to learn Ruby. ");  
        }  
    }  
    }
    
}