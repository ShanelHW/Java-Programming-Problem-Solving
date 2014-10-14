/**
 *
 * @author N Shanel Hickman
 */

public class Assignment5_main {
    public static void main(String[] args) {
        // create array that could store 30 numbers
        double newArray[] = new double[30]; 
        //read in 30 random numbers between 1 and 6
        initialize(newArray);
        //perform linear search to determine how many elements are 1s,2s...Ns 
        categorize(newArray);
    }
    
    public static void initialize(double newArray[]) {
        //set control for for loop 
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = i;
           // Generate random number between 1 and 6
            double rand = (int)(1+(Math.random()*6)*1);
            //assign random number to array newArray
            newArray[i] = rand;        
        }  
        /*Use 
        *System.out.println(Arrays.toString(newArray));
        *to test array input
        */
    }    
        
    public static void categorize(double newArray[]) {
        //initialize counts
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        
        //set conditions for iteration
        for (int i = 0; i <= newArray.length-1; i++) {
            //check value at index for one
            if (newArray[i] == 1.0) {
                one = one + 1;
                }
            //check value at index for two
            else if (newArray[i] == 2.0) {
                two = two + 1;
                }
            //check value at index for three
            else if (newArray[i] == 3.0) {
                three = three + 1;
                }
            //check value at index for four
            else if (newArray[i] == 4.0) {
                four = four + 1;
                }
            //check value at index for five
            else if (newArray[i] == 5.0) {
                five = five + 1;
                }
            //all other conditions are 6
            else {      
                six = six + 1;
            }
        }    
        //Print findings of linear search for loop
        System.out.println("The number of ones is " + one + ".");
        System.out.println("The number of twos is " + two + ".");
        System.out.println("The number of threes is " + three + ".");
        System.out.println("The number of fours is " + four + ".");
        System.out.println("The number of fives is " + five + ".");
        System.out.println("The number of sixes is " + six + ".");
    }
}
