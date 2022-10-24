package Chapter2;
import java.util.Scanner;
import java.text.*;

public class Exercise2_19 {

	public static void main(String[] args) {
		// Get user input for three point
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the coordinates of three points seperated by spaces like x1 y1 x2 y2 x3 y3: ");
		double x1 = input.nextDouble(); 
		double y1 = input.nextDouble(); 
		
		double x2 = input.nextDouble(); 
		double y2 = input.nextDouble(); 
		
		double x3 = input.nextDouble(); 
		double y3 = input.nextDouble(); 
		
		
		double side1 = Math.pow((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)), 0.5);
        double side2 = Math.pow((Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2)), 0.5);
        double side3 = Math.pow((Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2)), 0.5);
        double s = (side1 + side2 + side3) / 2;
        
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("The area of the triangle is: " + df.format(area));
	}
	

}
