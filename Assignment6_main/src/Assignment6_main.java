
import java.util.Arrays;
import java.util.Scanner;
public class Assignment6_main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //create new scanner
       Scanner input = new Scanner(System.in);
       //request user input
       System.out.println("Enter a string: ");
       //takes user input
       String a = input.nextLine();
       //replace characters that are not a-z of A-Z with nothing
       String b = a.replaceAll("[^a-zA-Z]", "");
       //split string
       String[] printColumn = b.split("");
       //sort characters in the array
       Arrays.sort(printColumn);
       //for loop to move along string and print charcters 
           for (int i = 0;i != printColumn.length; i++) {
                    System.out.println(printColumn[i]);
            }
        }
                    
       
        
        
       } 
   
    

