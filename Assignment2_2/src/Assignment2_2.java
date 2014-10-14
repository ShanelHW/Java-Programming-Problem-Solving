import javax.swing.JOptionPane;

public class Assignment2_2 {
    public static void main(String[] args) {
        //Prompt the user to enter temperature in Celsius
        String celsiusTempString = JOptionPane.showInputDialog(null, "What is the temperature in Celsius?", "Celsius to Farenheit Converter",JOptionPane.QUESTION_MESSAGE);
       
        //Convert string to double
        double celsiusTemp = 
            Double.parseDouble(celsiusTempString);

        //compute double conversion to fahrenheit
        double farenheitTemp = (9.0 / 5) * celsiusTemp + 32;
                
        //State result of conversion
        String output = celsiusTemp + " degrees Celsius is " + farenheitTemp + " degrees Fahrenheit";
        JOptionPane.showMessageDialog(null, output);
    }
}

