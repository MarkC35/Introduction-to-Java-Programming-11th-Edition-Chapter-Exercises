package Chapter2;
import java.util.Scanner;

public class Exercise2_5 {

	public static void main(String[] args) {
		// Get user input for total and gratuity rate
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate: ");
		double subtotalInput = input.nextDouble();
		double gratuityRate= input.nextDouble();
		
		// Calculate gratuity and total amount then display them
		double gratuity = subtotalInput * (gratuityRate / 100);
		double total = gratuity + subtotalInput;
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
		
	}

}
