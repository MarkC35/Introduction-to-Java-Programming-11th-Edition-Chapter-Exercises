package Chapter2;
import java.util.Scanner;

public class Exercise2_6 {

	public static void main(String[] args) {
		// Get user input for number between 0-1000
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int userNumber = input.nextInt();

		
		// Create integers for equation
		int number = userNumber;
		int multiplication = userNumber % 10;
		
		// Take number and multiply all digits in the integer
		if (userNumber > 1000 || userNumber < 0) {
			System.out.println("Invalid Number! Choose between 1-1000.");
		}
		else {
			while (number / 10 != 0) {
				number = number / 10;
				multiplication *= number % 10;
			}
			
			System.out.println("The multiplication of all digits in " + userNumber + " is " + multiplication);
		}

	}
}