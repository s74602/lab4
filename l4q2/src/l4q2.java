import javax.swing.JOptionPane;

public class l4q2 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        String input, message;
        final double PI = 3.14159;
        double radius, diameter, circumference, area;
        
        input = JOptionPane.showInputDialog("Enter radius value");
        //message1 = JOptionPane.showInputDialog("Enter the radius value: ");
        radius = Double.parseDouble(input);
       
        diameter = 2 * radius;
        circumference = 2 * PI * radius;
        area = PI * (radius * radius);
        
        message = String.format("The diameter is %.2f", diameter)+
                  String.format("\nThe circumference is %.2f", circumference)+
                  String.format("\nThe area is %.2f", area);
        
        JOptionPane.showMessageDialog(null,message);
        
    }
}
