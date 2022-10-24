package Chapter2;
import java.util.Scanner;
import java.text.*;

public class Exercise2_14 {

	public static void main(String[] args) {
		// Get user input for weight in pounds and height in inches
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weightInPounds = input.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double heightInInches = input.nextDouble();
		
		// Convert pounds to kilograms and inches to meters
		double weightInKilograms = weightInPounds *  0.45359237;
		double heightInMeters = heightInInches * 0.0254;
		
		// Calculate BMI by diving weight in kilograms by the square of height meters
		double bmi = weightInKilograms / (Math.pow(heightInMeters, 2));
		DecimalFormat df = new DecimalFormat("#.####");
		System.out.println("Your BMI is: " + df.format(bmi));
		
	}

}
