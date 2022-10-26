package Chapter3;
import java.util.Scanner;

public class Exercise3_3 {

	public static void main(String[] args) {
		// Use Cramer's Rule in 1.13. Get user input for a b c d e f
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter values for a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		// create equation and if statement for 2X2 linear equation
		
	
		if (a * d != b * c) {
			System.out.println("x is " + (e * d - b * f) / (a * d - b * c) + " and y is " + (a * f - e * c) / (a * d - b * c));
		}
		else {
			System.out.println("The equation has no solution");
		}
				

	}

}
