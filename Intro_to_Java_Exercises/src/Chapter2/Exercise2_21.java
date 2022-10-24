package Chapter2;
import java.util.Scanner;
import java.text.*;

public class Exercise2_21 {

	public static void main(String[] args) {
		// Program reads investment amount, annual interest rate and number of years
		// Displays future investment value
		
		Scanner input = new Scanner(System.in);
		
		// Get investment amount
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		// Get Annual interest rate in percentage
		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble() / 100;
		double monthlyInterestRate = annualInterestRate / 12;
		
		// Get number of years
		System.out.print("Enter number of years: ");
		int year = input.nextInt();
		
		// Calculate future investment value
		double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), year * 12);
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Future value is $" + df.format(futureInvestmentValue));
		

	}

}
