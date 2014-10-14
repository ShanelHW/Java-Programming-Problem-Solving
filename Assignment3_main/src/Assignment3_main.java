
public class Assignment3_main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create integer counter
        int counter;
        
        //for int counter start with value of 1 
        //add 1 each time the integer is less than 100
        for(counter = 99; counter >= 0; counter--) {  
            if (counter >=2) {
            System.out.println(counter + " bottles of beer on the wall." + counter +" bottles of beer. Take one down and pass it around "); 
            }
            // Print sentence with a new line for 1 
            if (counter == 1) {  
                System.out.println(counter + " bottle of beer on the wall." + counter + "bottle of beer. Take one down and pass it around ");  
                }
            // Print sentence with a new line for 0 
            if (counter == 0) {
               System.out.println("No bottles of beer on the wall. No bottles of beer. We took them all down and passed them around. No bottles of beer on the wall.");
           } 
        }  
    }  
}
    
