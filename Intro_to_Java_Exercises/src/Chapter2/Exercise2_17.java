package Chapter2;
import java.util.Scanner;

public class Exercise2_17 {

	public static void main(String[] args) {
		// Get user input for temperature between -58 and 41 degrees and wind speed
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		double temperatureFahrenheit = input.nextDouble();
		
		
		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		double windSpeed = input.nextDouble();
		
		// Calculate wind chill temperature
			
		double windChill = 35.74 + (0.6215 * temperatureFahrenheit) - 35.75 * (Math.pow(windSpeed, 0.16)) + 0.4275 * temperatureFahrenheit * Math.pow(windSpeed, 0.16);
		System.out.println("The wind chill index is " + windChill);

	}

}
