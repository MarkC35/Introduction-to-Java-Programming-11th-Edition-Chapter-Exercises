package Chapter2;
import java.util.Scanner;
import java.lang.Math;

public class Exercise2_2 {
	public static void main(String[] args) {
	
	// User input sides and height of triangle
	Scanner input = new Scanner(System.in);
	System.out.println("Enter length of the sides and height of the Equilateral Triangle: ");
	double triangleSideLength = input.nextDouble();
	
	// calculate are of triangle and display result
	double area = Math.pow(3, 0.5) / 4 * Math.pow(triangleSideLength, 2);
	System.out.println("The area is: " + area);
	
	// calculate and display volume of the triangle
	double volume = area * triangleSideLength;
	System.out.println("The volume of the Trianguolar prism is: " + volume);
	
	
	
	}

}
