package Chapter2;
import java.util.Scanner;
import java.text.*;

public class Exercise2_12 {

	public static void main(String[] args) {
	// Get user input for speed v in m/s & the acceleration in m/s^2
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter speed and acceleration: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		
	// Calculate length using v^2 / 2a and display result
		double length = Math.pow(speed, 2) / (2 * acceleration);
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("The minimum runway length for this airplane is " + df.format(length));
		

	}

}
