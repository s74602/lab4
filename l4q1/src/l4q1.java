import java.util.Scanner;

public class l4q1 {
    
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first Integer: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the second Integer: ");
        int num2 = input.nextInt();
        
        int square1 = num1 * num1;
        int square2 = num2 * num2;
        int sumSquare = square1 + square2;
        int diffSquare= square1 - square2;
        
        System.out.println("The square number " + num1 + " is "  + square1);
        System.out.println("The square number " + num2 + " is " + square2);
        System.out.println("The sum square of " +num1 + " and " + num2 + " is " + sumSquare);
        System.out.println("The differences of square " + num1 + "and" + num2 + " is " + diffSquare);
    }
    
}
