package Chapter2;
import java.util.Scanner;
import java.text.*;

public class Exercise2_20 {

	public static void main(String[] args) {
		// Get balance and interest rate from user
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		
		// Calculate interest 
		double interest = balance * (annualInterestRate / 1200);
		
		// Display result
		DecimalFormat df = new DecimalFormat("#.#####");
		System.out.println("The interest is: " + df.format(interest));

	}

}
