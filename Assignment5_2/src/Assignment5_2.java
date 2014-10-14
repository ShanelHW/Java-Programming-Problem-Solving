/**
 *
 * @author N Shanel Hickman
 */
public class Assignment5_2 {
    public static void main(String[] args) {
       
        // create array that could store 1000 numbers
        double[] kiloDouble = new double[1000]; 
        //call initialize to add 1000 doubles to the array
        initialize(kiloDouble);    
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
}