/**
 *
 * @author N Shanel Hickman
 */

import java.util.Arrays;

public class Assignment5_4 {
    public static void main(String[] args) {
       
        // create array that could store 1000 numbers
        double[] kiloDouble = new double[1000]; 
        //call initialize to add 1000 doubles to the array
        initialize(kiloDouble);
        //call reverse on kiloDouble
        reverse(kiloDouble);      
        //call average on kiloDouble
        average(kiloDouble);
    }
    
    public static void initialize(double kiloDouble[]) {
        //set control for for loop 
        for (int i = 0; i < kiloDouble.length; i++){
            kiloDouble[i] = i;
           // Generate random number between 0 and 500
            double randNum = (int)((Math.random()*500)*1);
            //assign random number to array kiloDouble
            kiloDouble[i] = randNum;        
        }
    }
    
    /*
    * Create a method that takes an array and prints the array in reverse.
    * Array does not change initial array.
    */    
    public static void reverse(double[]kiloDouble) {
        //create array to contain reversed elements from kiloDouble array
        double kiloReverse[] = new double[1000];
        int r = 0;
        /*use for loop with i and r to add last element of kiloDouble to first 
        index of kiloReverse*/
        for (int i = kiloDouble.length - 1; i > -1; i--){
            kiloReverse[r] = kiloDouble[i];            
            r++; 
        }
        //print array in reverse
        System.out.println(Arrays.toString(kiloReverse));
    }
    
    public static void average(double[]kiloDouble){
            
        double sum = 0;
        double avg = 0;
        
        for (int i = 0; i<kiloDouble.length-1; i++){
        sum = sum + kiloDouble[i];
        }
        //calculate average
        avg = (avg + sum) / kiloDouble.length;
        System.out.println(avg);
    }                   
}
