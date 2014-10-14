import java.util.Scanner;

public class Assignment4_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Welcome to the Command Line Calculator");
    System.out.println();
    while (true){
          
        Scanner input = new Scanner(System.in);
        //display menu with Add,Subtract, Multiply, Divide, and Quit
        System.out.println("-----");
        System.out.println("MENU");
        System.out.println("-----");
        System.out.println("Add");
        System.out.println("Subtract ");
        System.out.println("Multipy ");
        System.out.println("Divide ");
        System.out.println("Quit");
        
        //ask user for selection
        System.out.println("Select an option: ");
        
        //set user's option to userInput
        String userInput = input.next();
        /**if else if for variable input value to associated method**/
        if (userInput.equalsIgnoreCase("add")) {
            add();
        }
        else if (userInput.equalsIgnoreCase("subtract")) { 
            subtract();
        }
        else if (userInput.equalsIgnoreCase("multiply")) {
            multiply();
        }
        else if (userInput.equalsIgnoreCase("divide")) {
            divide();
        }
        else  if (userInput.equalsIgnoreCase("quit")) {
            
            System.out.println("Please try the Command Line Calculator again. Goodbye.");
            return;
        }        
        else {
            System.out.println("Please re-enter your selection: ");
        }
      }
    }
    
        public static float add() {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number: ");
        float num1 = input.nextFloat();
        System.out.println("Enter a number: ");
        float num2 = input.nextFloat();
        float value = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + value);
        return value;
        }
        
        public static float subtract() {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number: ");
        float num1 = input.nextFloat();
        System.out.println("Enter a number: ");
        float num2 = input.nextFloat();
        float value = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + value);
        return value;
        }
        
        public static float multiply() {     
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number: ");
        float num1 = input.nextFloat();
        System.out.println("Enter a number: ");
        float num2 = input.nextFloat();
        float value = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + value);
        return value;
        }
        public static float divide() {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number: ");
        float num1 = input.nextFloat();
        System.out.println("Enter a number: ");
        float num2 = input.nextFloat();
        float value = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + value);
        return value;
        }
        
        
}
