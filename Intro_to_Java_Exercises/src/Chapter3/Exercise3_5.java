package Chapter3;
import java.util.Scanner;

public class Exercise3_5 {

	public static void main(String[] args) {
		// Get user input for integer for day of week; Sunday = 0, Monday = 1, etc & days elapsed since
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day using 0-6: ");
		int dayOfWeek = input.nextInt();
		
		System.out.print("Enter the number of days elapsed since today: ");
		int daysElapsed = input.nextInt();
		
		// take both inputs to calculate current and future day
		String today = " ";
		switch (dayOfWeek) {
			case 0:
				today = "Sunday"; 
				break;
			case 1:
				today = "Monday";
				break;
			case 2:
				today = "Tuesday";
				break;
			case 3:
				today = "Wednesday";
				break;
			case 4:
				today = "Thursday";
				break;
			case 5:
				today = "Friday";
				break;
			case 6:
				today = "Saturday";
		}
		
		String futureDay = " ";
		switch ((dayOfWeek + daysElapsed) % 7) {
			case 0:
				futureDay = "Sunday"; 
				break;
			case 1:
				futureDay = "Monday";
				break;
			case 2:
				futureDay = "Tuesday";
				break;
			case 3:
				futureDay = "Wednesday";
				break;
			case 4:
				futureDay = "Thursday";
				break;
			case 5:
				futureDay = "Friday";
				break;
			case 6:
				futureDay = "Saturday";
		}
		System.out.println("Today is " + today + " and the future day is " + futureDay);
	}

}
