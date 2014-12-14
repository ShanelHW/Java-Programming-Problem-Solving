/*
 * No license info
 * WebBSIT 1310 - Programming and Problem Solving I
 * Fall 2014
 */
/**
 *
 * @author N Shanel Hickman
 */
public class Assignment8_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    //create superclass Snack
    abstract class Snack {
         public int calories;
         public float cost;    
         
         public abstract String toString();
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
        String name = "M & M's";
        int calories = 90;
        float cost = .75f;

        @Override
        public String toString() {
            return name + " cost" + cost + "and have " + calories + "calories.";
        }
    }
    class Popcorn extends Salty{
        String name = "Popcorn";
        int calories = 50;
        float cost = 1.25f;

        public String toString() {
            return  name + " costs" + cost + "and has " + calories + "calories.";
        }
    }
    class Snickers extends Sugary{
        String name = "Snickers";
        int calories = 125;
        float cost = 1.25f;

        @Override
        public String toString() {
            return name + " cost" + cost + "and have " + calories + "calories.";
        }
    }
    class Gum extends Sugary{
        String name = "Gum";
        int calories = 10;
        float cost = .50f;

        public String toString() {
            return name + " cost" + cost + "and have " + calories + "calories.";
        }
    }
    class Crackers extends Salty{
        String name = "Crackers";
        int calories = 80;
        float cost = .85f;

        @Override
        public String toString() {
            return name + " cost" + cost + "and have " + calories + "calories.";
        }
    }
    class Chips extends Salty{
        String name = "Crackers";
        int calories = 80;
        float cost = .85f;

        @Override
        public String toString() {
            return name + " cost" + cost + "and have " + calories + "calories.";
        }
    }
}
          