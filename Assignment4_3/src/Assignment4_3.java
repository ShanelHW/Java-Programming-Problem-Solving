import java.util.Scanner;
public class Assignment4_3 {

    public static void main(String[] args) {
      /** Main method */
      //Create a Scanner
      Scanner input = new Scanner (System.in);
      
      //Prompt user for numbers
      System.out.println("Enter a number: ");
      double num1 = input.nextDouble();
      System.out.println("Enter a number: ");
      double num2 = input.nextDouble();
      System.out.println("Enter a number: ");
      double num3 = input.nextDouble();
      
      // call method
     displaySortedNumbers(num1, num2, num3);

    }
    
    public static void displaySortedNumbers(double num1, double num2, double num3){
        //determine order
        if(num1 < num2 && num2 < num3)
        {
            System.out.println(num1 + " " + num2 + " " + num3);
        }

        else if(num1 < num3 && num3 < num2)
        {
            System.out.println(num1 + " " + num3+ " " + num2);
            
        }

        else if(num2<num1&&num3>num1)
        {
            System.out.println(num2 + " " + num1+ " " + num3);
        }

        else if(num2<num3&&num3<num1)
        {
            System.out.println(num2 + " " + num3+ " " + num1);
        }

        else if (num3<num2&&num2>num1)
        {
           System.out.println(num3 + " " + num1+ " " + num2);
        }
        else if (num3<num2&&num1>num2)
        {
           System.out.println(num3 + " " + num2+ " " + num1);
        }
         //if all numbers are equal
        else if (num3 == num2 && num2 == num1) 
        {
           System.out.println(num1 + " " + num2+ " " + num3);
        }
        //If two numbers are equal
        else if (num3 > num2 && num2 == num1) 
        {
           System.out.println(num1 + " " + num2+ " " + num3);
        }
        else if (num3 < num2 && num2 == num1) 
        {
           System.out.println(num3 + " " + num2+ " " + num1);
        }
       
        else if (num2 > num1 && num3 == num1) 
        {
           System.out.println(num1 + " " + num3+ " " + num2);
        }
        else if (num2 < num1 && num3 == num1) 
        {
           System.out.println(num2 + " " + num3+ " " + num1);
        }
        
        else if (num1 > num2 && num2 == num3) 
        {
           System.out.println(num1 + " " + num2+ " " + num3);
        }
        else if (num1 < num2 && num2 == num3) 
        {
           System.out.println(num1 + " " + num2+ " " + num3);
        }
        
    }
}
