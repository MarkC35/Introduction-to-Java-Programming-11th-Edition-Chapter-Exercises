package Chapter2;
import java.util.Scanner;

public class Exercise2_11 {

	public static void main(String[] args) {
		// Get user input for number of years
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of years: ");
		int numberOfYears = input.nextInt();
		
		
		// Calculate current population then multiply by user input
		int secondsPerYear = 365 * 24 * 60 * 60;
		
		double birthInYear = secondsPerYear / 7.0;
		double deathInYear = secondsPerYear / 13.0;
		double immigrantInYear = secondsPerYear / 45.0;
		
		double currentPopulation = 312032486;
		
		
		currentPopulation = currentPopulation + (birthInYear - deathInYear + immigrantInYear) * numberOfYears;
		System.out.println("The population in " + numberOfYears + " is " + (int) currentPopulation);



	}

}
