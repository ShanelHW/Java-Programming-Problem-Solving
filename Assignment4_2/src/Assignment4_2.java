import java.util.Scanner;
public class Assignment4_2 {

    public static void main(String[] args) {
      /** Main method */
      //Create a Scanner
      Scanner input = new Scanner (System.in);
      
      //Prompt user for width
      System.out.println("Width: ");
      double width = input.nextDouble();
              
      //Prompt user for height
      System.out.println("Height: ");
      double height = input.nextDouble();
      
      // call method
     double area = findArea(width,height);
      //print area
      System.out.println("Area: " + area);

    }
    
    public static double findArea(double width, double height){
        //determine area
       double result = width * height;
       return result;
        
        
    }
}
