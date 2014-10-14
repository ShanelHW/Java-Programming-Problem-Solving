import java.util.Scanner;

public class Assignment3_2 {
    public static void main(String[] args) {
        // ask user for an integer
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
     
        //integers are the remainder of user input number by 5 or 6
        int divisibleFive = number % 5;
        int divisibleSix = number % 6;
        
        //if number is divisible by 5 and 6
        if ((divisibleFive == 0) && (divisibleSix == 0))
        {
            System.out.print(number + " is divisible by both 5 and 6. ");             
        }
        //if number is divisible by neither 5 or 6
         else if (((divisibleFive != 0) && (divisibleSix != 0)))
        {
            System.out.print(number + " is not divisible by 5 or 6. ");
        }  
        //if number is divisible by 5 or 6
        else if (((divisibleFive == 0) || (divisibleSix == 0)))
        {
            System.out.print(number + " is divisible by 5 or 6, but not both. ");
        }  
        
        
    }              
}
