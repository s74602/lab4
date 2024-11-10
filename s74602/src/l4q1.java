
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class l4q1 {
        public static void main(String[] args) {
        // TODO code application logic here
        double amount_today, account_value, num_years, annual_interest_rate;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("****************************************************");
        System.out.println("\t\tMY SAVING FORECAST PROGRAM");
        System.out.println("****************************************************");
        System.out.print("WHAT IS THE VALUE YOU WANT TO HAVE IN YOUR BANK ACCOUNT: RM ");
        account_value = input.nextDouble();
        System.out.print("HOW MANY YEARS YOU WANT THE MONEY TO SIT IN YOUR ACCOUNT :");
        num_years = input.nextDouble();
        System.out.print("WHAT IS THE ANNUAL INTEREST RATE (IN %) :");
        annual_interest_rate = input.nextDouble();
        
        amount_today = account_value / (Math.pow ( 1 + (annual_interest_rate / 100 ), num_years));
        
        System.out.printf("\nTHE AMOUNT YOU NEED TO DEPOSIT TODAY IS RM %.2f%n" , amount_today);
    }
    
    
}
