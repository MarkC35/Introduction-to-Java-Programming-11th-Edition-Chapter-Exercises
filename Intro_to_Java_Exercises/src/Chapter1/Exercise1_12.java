package Chapter1;

public class Exercise1_12 {

	public static void main(String[] args) {
		double milesToKilo = ((24 * 1.6) / (1 + 40.0 / 60 + 35.0 / 60 / 60));
		System.out.println("The avg speed in kilometers/hour is: " + milesToKilo);
	}

}
