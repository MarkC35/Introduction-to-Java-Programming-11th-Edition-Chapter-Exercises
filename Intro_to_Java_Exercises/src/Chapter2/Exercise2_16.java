package Chapter2;
import java.util.Scanner;
import java.text.*;

public class Exercise2_16 {

	public static void main(String[] args) {
		// Get user input for length of the side
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of the side: ");
		double side = input.nextDouble();
		
		// Calculate the area and display result
		double area = (3 * Math.pow(3, 0.5) / 2) * Math.pow(side, 2);
		DecimalFormat df = new DecimalFormat("#.####");
		System.out.println("The area of the hexagon is " + df.format(area));
		

	}

}
