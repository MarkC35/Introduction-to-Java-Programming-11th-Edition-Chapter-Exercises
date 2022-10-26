package Chapter3;
import java.util.Scanner; 

public class Exercise3_2 {

	public static void main(String[] args) {
	// 	Revise Listing 3.1 to generate 3 single-digit integers and prompt the user to enter the multiplication of these 3
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is " + number1 + " * " + number2 + " * " + number3 + "? ");
		int answer = input.nextInt();
		
		System.out.println(number1 + " * " + number2 + " * " + number3 + " is " + (number1 * number2 * number3 == answer));
	}

}
