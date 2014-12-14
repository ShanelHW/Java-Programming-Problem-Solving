
import java.util.Scanner;
public class Assignment6_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a string: ");
       //Takes user input and assigns to string a
       String a = input.nextLine();
       //Splits string a and assigns to String[]
       String[] column = a.split("");
       //for loop to move along string with print charcters in string
           for (int i = 0;i != column.length; i++) {
           System.out.println(column[i]);
       
        
        
       } 
    }
    
}
