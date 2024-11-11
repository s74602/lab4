import java.util.Scanner;

public class l4q6 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       
        double num1, num2, num3, mean, variance, standard_Deviation;
        
        System.out.print("Enter the first number: ");
        num1 = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        num2 = input.nextDouble();
        
        System.out.print("Enter the third number: ");
        num3 = input.nextDouble();
        
        mean = (num1 + num2 + num3) / 3;
        variance = (Math.pow((num1 - mean),2) + Math.pow((num2 - mean),2) + Math.pow((num3 - mean), 2))/3;
        standard_Deviation = Math.sqrt(variance);
        
        System.out.printf("Mean = %.2f" , mean);
        System.out.printf("\nVariance = %.2f" , variance);
        System.out.printf("\nStandard deviation =  %.2f\n" , standard_Deviation);
    }
}
