import javax.swing.JOptionPane;

public class Assignment2_1 {
    public static void main(String[] args) {
        //Ask for user's name
        String userName = JOptionPane.showInputDialog(null, "What is your name?", JOptionPane.QUESTION_MESSAGE);
            
        //Say Hello
        JOptionPane.showMessageDialog(null,"Hi " + userName + "!");
    }
}
