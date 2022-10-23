package Chapter2; 
import java.util.Scanner;

public class Exercise2_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter miles: ");
		double mile = input.nextDouble();
		
		double kilometer = mile * 1.6;
		
		System.out.println(mile + " mile(s) is " + kilometer + " kilometers");
	}

}
