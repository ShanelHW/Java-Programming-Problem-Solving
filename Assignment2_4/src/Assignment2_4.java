import javax.swing.JOptionPane;

public class Assignment2_4 {
    public static void main(String[] args) {
        //Prompt user to enter subtotal
        String subTotalString = JOptionPane.showInputDialog( null,"What is the subtotal of your bill? ", null, JOptionPane.QUESTION_MESSAGE);
      
        //Convert string to double
        double subTotal =
                Double.parseDouble(subTotalString);
        
       
        //Prompt the user to enter gratuity rate
         String gratuityRateString = JOptionPane.showInputDialog( null,"What is the gratuity rate? ", null, JOptionPane.QUESTION_MESSAGE);
      
        //Convert string to double
        double gratuityRate =
                Double.parseDouble(gratuityRateString);
        
        //compute gratuity amount
        double gratuityPaid = subTotal * (gratuityRate / 100);
        //compute total bill
        double finalBill = subTotal + gratuityPaid;               
            //Display results
            String output1 = (" For a bill of $" + subTotal + " bill and a gratuity rate of " + gratuityRate + "%...");
            String output2 = ("\n The gratuity is $" + gratuityPaid + " and the total is $" + finalBill);
            JOptionPane.showMessageDialog(null,output1 + output2);
	}
}