package Chapter2;
import java.util.Scanner;

public class Exercise2_3 {

	public static void main(String[] args) {
		// get user input for a number in meters
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for meter: ");
		double meter = input.nextDouble();
		
		// meter to feet conversion
		double feetConversion = meter * 3.2786;
		
		// display result of meters to feet
		System.out.println(meter + " meters is " + feetConversion + " feet.");
		

	}

}
