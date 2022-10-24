package Chapter2;
import java.util.Scanner;

public class Exercise2_7 {

	public static void main(String[] args) {
		// user input number of minutes
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		int numberOfMinutes = input.nextInt();
		
		// Calculate number of years and remaining days
		int totalNumberOfDays = numberOfMinutes / 60 / 24;
		int totalNumberOfYears = totalNumberOfDays / 365;
		int remainingDays = totalNumberOfDays - totalNumberOfYears * 365;

		System.out.println(numberOfMinutes + " minutes is approximately " + totalNumberOfYears + " years and " + remainingDays + " days");
		
	}

}
