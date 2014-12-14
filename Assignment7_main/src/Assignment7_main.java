import java.util.Scanner;

public class Assignment7_main {
        public static class VendingMachine {
        //attributes
        int sodaCount = 50;
        float moneyCredit = 0;
        
        //Constructor
       public VendingMachine() {
        }
       
       //add credit
       public float addMoney(float newMoneyCredit) {
           moneyCredit = newMoneyCredit + moneyCredit;
           return moneyCredit;
       }
       
       //vend beverage and return change
       public void vend() {
        sodaCount--;
        System.out.println("Enjoy your beverage.");
        System.out.println(moneyCredit-0.65 + " is your change");
        
        }
       
       //restock machine
       public void restock() {
           sodaCount = 50;
           System.out.println("Beverages have been restocked.");
       }
       
    }
        
        public static void main(String[] args) {
       //Main Menu
       VendingMachine vending1 = new VendingMachine();  
       System.out.println("* * * * * * * * * * * * * * ");
       System.out.println("CheerBuzz Vending Company");
       System.out.println("* * * * * * * * * * * * * * ");
       
       System.out.println("Please Select an Option: ");
       System.out.println("Press 1 to Buy a Soda or Press 2 to Restock the Machine");
       Scanner input = new Scanner(System.in);
       int userInput = input.nextInt();
       
       //Buy a soda
       if (userInput == 1) {
            while (vending1.moneyCredit < 0.65){
                System.out.println("All sodas are $0.65. Please add change. ");
                float userInput2 = input.nextFloat();
                vending1.addMoney(userInput2);
            }     
            vending1.vend();               
       }
       //Restock Machine
       else if (userInput == 2) {
           vending1.restock();
       }
    } 
}
