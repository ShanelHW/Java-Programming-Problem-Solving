import java.util.Scanner;

public class Assignment9_main {
    
    public static VendingMachine vending1 = new VendingMachine(100, 0.00f, 0.00f);
    
/*VENDING MACHINE SETUP STARTS HERE*/     
    public static class VendingMachine {
    //attributes
    int snackCount;
    float moneyCredit;
    float itemCost;

   //Constructor
   public VendingMachine(int snackCountInput, float moneyCreditInput, float itemCostInput) {
    this.snackCount = snackCountInput ;
    this.moneyCredit = moneyCreditInput;
    this.itemCost = itemCostInput;
    }

   public void setItemCost(float snackItemCost){
       this.itemCost = snackItemCost;
   }
   
   //add credit
   public float addMoney() {
       System.out.println("Please insert cash ");
       Scanner input = new Scanner(System.in);
       float newMoneyCredit = input.nextFloat();
       moneyCredit = newMoneyCredit + moneyCredit;
       return moneyCredit;
   }

   //vend beverage and return change
   public void vend() { 
    while (moneyCredit < itemCost){
                    addMoney();
                }
    snackCount--;
    System.out.println("Enjoy your snack.");
    //changed to deduct variable cost from moneyCredit here
    System.out.println(moneyCredit-itemCost + " is your change");
    }
    
       
   //restock machine
   public void restock() {
       //add in options to add different snacks up to a count of 100 total
       snackCount = 100;
       System.out.println("Snacks have been restocked.");
       }
       
    }

/*SNACK INFO STARTS HERE*/         
        
//create superclass Snack
    abstract class Snack {
         public int calories;
         public float cost;   
         public String name;
         
         @Override
         public String toString() {
             return name + " cost" + cost + "and have " + calories + "calories.";
        }
    }
    
    //create subclasses Salty and Sweet that inherit from Snack
    abstract class Salty extends Snack{
    }

    abstract class Sugary extends Snack{    
    }
    
    //create individual classes for snack types that inherit from Salty and Sweet
    //each should have it's own implementation of toString()
    //program could be further improved by defining toString in the Snack class rather than repeating the code in each subclass
    class Mms extends Sugary {
  
        public final static String NAME = "M & M's";
        public final static int CALORIES = 90;
        public final static float COST = .75f;

        @Override
        public String toString() {
            return super.toString();
        }
    }
    
    class Popcorn extends Salty{
          public final static String NAME = "Popcorn";
        public final static int CALORIES = 50;
        public final static float COST = 1.25f;
        
        
        @Override
        public String toString() {
            return super.toString();
        }
    }
    
    class Snickers extends Sugary{
          public final static String NAME = "Snickers";
        public final static int CALORIES = 125;
        public final static float COST = 1.25f;
       
        
        @Override
        public String toString() {
            return super.toString();
        }
    }
    
    class Gum extends Sugary{
          public final static String NAME = "Gum";
        public final static int CALORIES = 10;
        public final static float COST = .50f;
      
        @Override
        public String toString() {
            return super.toString();
        }
    }
    
    class Crackers extends Salty{
          public final static String NAME = "Crackers";
        public final static int CALORIES = 80;
        public final static float COST = .85f;
        
        @Override
        public String toString() {
            return super.toString();
        }
    }

    class Chips extends Salty{
          public final static String NAME = "Chips";
        public final static int CALORIES = 80;
        public final static float COST = .85f;
       
        
        @Override
        public String toString() {
            return super.toString();
        }
    }        
        
        
    
    
    public static void snackMenu(){
        Scanner input = new Scanner(System.in);
         while(true){
           //display submenu of shack options    
           System.out.println("* * * * * * * * * * * * * * ");
           System.out.println("Snack-Happy Vending Company");
           System.out.println("* * * * * * * * * * * * * * ");

           System.out.println("Select a Snack Option: ");
           System.out.println("Press 1 for M & M's");
           System.out.println("Press 2 for Popcorn");
           System.out.println("Press 3 for Snickers");
           System.out.println("Press 4 for Gum");
           System.out.println("Press 5 for Crackers");
           System.out.println("Press 6 for Chips");
           System.out.println("Press 0 to Quit");
           
           int snackSelection = input.nextInt();
           switch (snackSelection) { 
            case 1: 
                vending1.setItemCost(Mms.COST);
                vending1.vend();
                break;
            case 2: 
                vending1.setItemCost(Popcorn.COST);
                vending1.vend();
                break;
            case 3: 
                vending1.setItemCost(Snickers.COST);
                vending1.vend();
                break;
            case 4: 
                vending1.setItemCost(Gum.COST);
                vending1.vend();
                break;
            case 5: 
                vending1.setItemCost(Crackers.COST);
                vending1.vend();
                break;  
            case 6: 
                vending1.setItemCost(Chips.COST);
                vending1.vend();
                break;
            case 0: 
                return;    
            }
               
           }
    }
    
    /*MAIN STARTS HERE*/
    public static void main(String[] args) {
       //Main Menu
         
       System.out.println("* * * * * * * * * * * * * * ");
       System.out.println("Snack-Happy Vending Company");
       System.out.println("* * * * * * * * * * * * * * ");
       
       System.out.println("Please Select an Option: ");
       System.out.println("Press 1 to Choose a Snack, or Press 0 to Restock the Machine");
       Scanner input = new Scanner(System.in);
       int userInput = input.nextInt();
       
       switch (userInput) { 
            case 1: 
            snackMenu();
            break;
            case 0:
            vending1.restock();
            break;
       }
    } 
}
