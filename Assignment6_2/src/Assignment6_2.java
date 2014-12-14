
import java.util.Scanner;
public class Assignment6_2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a string: ");
       //Takes user input
       String a = input.nextLine();
       StringBuffer b = new StringBuffer(a);
       b = b.reverse();
       String c = b.toString(); 
       String[] d = c.split("");
       //create for loop to move along string with 
        //print charcters in string using System.out.println(array[i])
        //continue condition is i=array.length+1
           for (int i = 0;i != d.length; i++) {
           System.out.println(d[i]);
       } 
    }
    
}
