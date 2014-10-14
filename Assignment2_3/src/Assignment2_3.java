import javax.swing.JOptionPane;
        
public class Assignment2_3 {
    public static void main(String[] args) {
        //Prompt the user to enter the radius
        String radiusString = JOptionPane.showInputDialog( null,"What is the radius of the cylinder? ", null, JOptionPane.QUESTION_MESSAGE);
        
        //Prompt the user to enter the length
        String lengthString = JOptionPane.showInputDialog( null,"What is the length of the cylinder? ", null, JOptionPane.QUESTION_MESSAGE);
        
        //Convert strings to doubles
        double radius = 
                Double.parseDouble(radiusString);
        double length = 
                Double.parseDouble(lengthString);

        //compute area
        double area = radius * radius * Math.PI;
        //compute volume
        double volume = area * length;
                
        //Display results
        String output = (" Radius: " + radius + "\n Length: " + length +
        "\n Area: " + area + "\n Volume: " + volume);
        
        JOptionPane.showMessageDialog(null,output); 
    }
}