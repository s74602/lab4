import javax.swing.JOptionPane;

public class l4q3 {
    
     public static void main(String[] args) {
        // TODO code application logic here
        int currentYear = 2024;
        
        String input = JOptionPane.showInputDialog("Enter your IC number");
        
        String yearPart = input.substring(0,2);//03 = 2003
        String monthPart = input.substring(2,4);
        String dayPart = input.substring(4,6);

        int birthYear = Integer.parseInt(yearPart);
        int month = Integer.parseInt(monthPart);
        int day = Integer.parseInt(dayPart);
        
        birthYear = birthYear + 2000;
        
        int age = currentYear - birthYear;
        
        String message = String.format("Birth date %d-%d-%d",day,month,birthYear)+
                         String.format("\nAge %d", age);
        
        JOptionPane.showMessageDialog(null, message);
    }
}
