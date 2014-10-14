import javax.swing.JOptionPane;

public class Assignment3_1 {
    public static void main(String[] args) {
        
        //ask user for age
        String ageString = JOptionPane.showInputDialog( null,"How old are you? ", null, JOptionPane.QUESTION_MESSAGE);
        //set user input to age
        double age = Double.parseDouble(ageString);
        
        //determine if of legal drinking age(21+)
        if (age >= 21) 
            {
                JOptionPane.showMessageDialog(null,"You're legal");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"You're not legal");
            }
    }
}
