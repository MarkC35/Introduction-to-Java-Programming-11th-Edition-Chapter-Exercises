package Chapter3;

import java.util.Scanner;

public class Exercise3_6 {

	public static void main(String[] args) {
		// Revise listing 3.4 to add feet. ex; 6feet 2inches
		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter your weight in pounds: ");
		double weightInPounds = input.nextDouble();
		
		System.out.print("Enter feet: ");
		double heightInFeet = input.nextDouble();
				
		System.out.print("Enter inches: ");
		double heightInInches = input.nextDouble();
				
		// Convert height to total inches
		double totalInches = (heightInFeet * 12) + heightInInches;
				
		// Convert inches and pounds to kilos and meters
		double weightInKilos = weightInPounds * 0.45359237;
		double heightInMeters = totalInches * 0.0254;
				
		// Calculate BMI
		double bmi = weightInKilos / Math.pow(heightInMeters, 2);
				
		// Display BMI result
		System.out.println("Your BMI is " + bmi);
				
		if (bmi < 18.5) {
			System.out.println("Underweight");
		}
		else if (bmi < 25.0) {
			System.out.println("Normal");
		}
		else if (bmi < 30) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}


	}

}
