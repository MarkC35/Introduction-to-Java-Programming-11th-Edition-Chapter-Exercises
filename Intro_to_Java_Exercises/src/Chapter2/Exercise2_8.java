package Chapter2;
import java.util.Scanner;

public class Exercise2_8 {

	public static void main(String[] args) {
		// Get user input for time zone offset
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the time zone offset to GMT: ");
		int offsetInput = input.nextInt();
		
		// Use Listing 2.7 ShowCurrentTime.java to get time in GMT
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHour = (totalHours + offsetInput) % 24;
		
		System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
		

	}

}
