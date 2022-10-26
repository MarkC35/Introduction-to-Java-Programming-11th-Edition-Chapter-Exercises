package Chapter3;
import java.util.Scanner;

public class Exercise3_4 {

	public static void main(String[] args) {
		// write program that randomly generates an integer 1-12 and displays the correct month
		
		int number = (int)(Math.random() * 12 + 1);
		
		switch (number) {
		case 1: 
			System.out.println("The random number is " + number + " which is January");
			break;
		case 2: 
			System.out.println("The random number is " + number + " which is February");
			break;
		case 3: 
			System.out.println("The random number is " + number + " which is March");
			break;
		case 4: 
			System.out.println("The random number is " + number + " which is April");
			break;
		case 5: 
			System.out.println("The random number is " + number + " which is May");
			break;
		case 6: 
			System.out.println("The random number is " + number + " which is June");
			break;
		case 7: 
			System.out.println("The random number is " + number + " which is July");
			break;
		case 8: 
			System.out.println("The random number is " + number + " which is August");
			break;
		case 9: 
			System.out.println("The random number is " + number + " which is September");
			break;
		case 10: 
			System.out.println("The random number is " + number + " which is October");
			break;
		case 11: 
			System.out.println("The random number is " + number + " which is November");
			break;
		case 12: 
			System.out.println("The random number is " + number + " which is December");
			break;
		
		}

	}

}
