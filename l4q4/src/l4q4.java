import javax.swing.JOptionPane;

public class l4q4 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        String userInput, result, uppercaseString, lowercaseString;
        
        userInput = JOptionPane.showInputDialog("Please enter any string: ");
       
        uppercaseString = userInput.toUpperCase();
        
        lowercaseString = userInput.toLowerCase();
        
        result = String.format("Uppercase : %s", uppercaseString) +
                 String.format("\nLowercase : %s", lowercaseString);
        
        JOptionPane.showMessageDialog(null, result);

    }
}
