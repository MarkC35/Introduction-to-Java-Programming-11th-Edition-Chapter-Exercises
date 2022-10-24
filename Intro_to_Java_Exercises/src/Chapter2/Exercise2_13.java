package Chapter2;
import java.util.Scanner;

public class Exercise2_13 {

	public static void main(String[] args) {
		// Get user input for monthly saving amount
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly saving amount: ");
		double savingsEachMonth = input.nextDouble();
		double accountValue = 0;
		
		
		accountValue = (savingsEachMonth + accountValue) * (1 + 0.003125);
		System.out.println("After the first month, the account value is " + accountValue);
		
		accountValue = (savingsEachMonth + accountValue) * (1 + 0.003125);
		System.out.println("After the second month, the account value is " + accountValue);
		
		accountValue = (savingsEachMonth + accountValue) * (1 + 0.003125);
		System.out.println("After the third month, the account value is " + accountValue);
		
		accountValue = (savingsEachMonth + accountValue) * (1 + 0.003125);
		accountValue = (savingsEachMonth + accountValue) * (1 + 0.003125);
		
		accountValue = (savingsEachMonth + accountValue) * (1 + 0.003125);
		System.out.println("After the sixth month, the account value is " + accountValue);

	}

}
