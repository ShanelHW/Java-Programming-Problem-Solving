import javax.swing.JOptionPane;
public class Assignment2_main {

    public static void main(String[] args) {
        // Ask user for four numbers and convert to floating point numbers 
        String number1String = JOptionPane.showInputDialog( null,"Enter a number ", null, JOptionPane.QUESTION_MESSAGE);        
            float number1 = Float.parseFloat(number1String);
        String number2String = JOptionPane.showInputDialog( null,"Enter a 2nd number ", null, JOptionPane.QUESTION_MESSAGE);
            float number2 = Float.parseFloat(number2String);
        String number3String = JOptionPane.showInputDialog( null,"Enter a 3rd number ", null, JOptionPane.QUESTION_MESSAGE);
            float number3 = Float.parseFloat(number3String);
        String number4String = JOptionPane.showInputDialog( null,"Enter a 4th number ", null, JOptionPane.QUESTION_MESSAGE);
            float number4 = Float.parseFloat(number4String);
        
        //Calculate Average,Sum, and Product
        float sumOf = (number1 + number2 + number3 + number4);
        float averageOf = (sumOf / 4);
        float productOf = (number1 * number2 * number3 * number4);

        //Display four numbers, average, sum, and product
        JOptionPane.showMessageDialog(null, "Numbers: " + number1 + ", " + number2 + ", " + number3 + ", and " +number4 +
              "\n Average: " + averageOf + 
              "\n Sum: " + sumOf + 
              "\n Product: " + productOf);
    }
    
}