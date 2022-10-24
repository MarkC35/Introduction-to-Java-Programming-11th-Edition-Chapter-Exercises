package Chapter2;
import java.util.Scanner;

public class Exercise2_4 {

	public static void main(String[] args) {
		// Get user input for square meter
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number in square meters: ");
		double squareMeter = input.nextDouble();
		
		// convert square meter to ping and display result
		double ping = squareMeter * 0.3025;
		System.out.println(squareMeter + " square meters is " + ping + " pings.");

	}

}
