package Chapter2;
import java.util.Scanner;

public class Exercise2_9 {

	public static void main(String[] args) {
		/* Get user input for starter velocity v0 in m/s, ending velocity v1 in m/s, and time t 
		in seconds. Then display the average acceleration */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter v0, v1, and t: ");
		double startingVelocity = input.nextDouble();
		double endingVelocity = input.nextDouble();
		double timeSpan = input.nextDouble();
		
		// Calculate average acceleration
		double acceleration = (endingVelocity - startingVelocity) / timeSpan;
		System.out.println("The average acceleration is " + acceleration);
			
		
	}

}
