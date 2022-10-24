package Chapter2;
import java.util.Scanner;

public class Exercise2_10 {

	public static void main(String[] args) {
		// Get user input for water in kilograms, the initial temperature and the final temperature
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		double kilosOfWater = input.nextDouble();
		
		System.out.print("Enter the intial temperature: ");
		double initialTemperature = input.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();

		// Equation to calculate energy to heat water
		double energy = kilosOfWater * (finalTemperature - initialTemperature) * 4184;
		System.out.println("The energy needed is " + energy);
	}

}
