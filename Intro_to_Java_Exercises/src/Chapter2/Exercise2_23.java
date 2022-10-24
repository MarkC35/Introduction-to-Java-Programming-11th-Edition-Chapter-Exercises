package Chapter2;
import java.util.Scanner;
import java.text.*;

public class Exercise2_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Get user input for distance of drive
		System.out.print("Enter the driving distance: ");
		double drivingDistance = input.nextDouble();
		
		// Get user input for miles per gallon 
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		// Get user input for price per gallon
		System.out.print("Enter miles per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		// Display cost of trip 
		double costOfDriving = (drivingDistance/ milesPerGallon) * pricePerGallon;
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("The cost of driving is $" + df.format(costOfDriving));
	}

}
