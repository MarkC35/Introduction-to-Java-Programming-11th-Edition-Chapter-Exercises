package Chapter1;

public class Exercise1_11 {

	public static void main(String[] args) {
		int secondsPerYear = 365 * 24 * 60 * 60;
		
		double birthInYear = secondsPerYear / 7.0;
		double deathInYear = secondsPerYear / 13.0;
		double immigrantInYear = secondsPerYear / 45.0;
		
		double currentPopulation = 312032486;
		
		
		currentPopulation = currentPopulation + birthInYear - deathInYear + immigrantInYear;
		System.out.println("Population of Year #1 is : " + (int) currentPopulation);

		currentPopulation = currentPopulation + birthInYear - deathInYear + immigrantInYear;
		System.out.println("Population of Year #2 is : " + (int) currentPopulation);
		
		currentPopulation = currentPopulation + birthInYear - deathInYear + immigrantInYear;
		System.out.println("Population of Year #3 is : " + (int) currentPopulation);
		
		currentPopulation = currentPopulation + birthInYear - deathInYear + immigrantInYear;
		System.out.println("Population of Year #4 is : " + (int) currentPopulation);
		
		currentPopulation = currentPopulation + birthInYear - deathInYear + immigrantInYear;
		System.out.println("Population of Year #5 is : " + (int) currentPopulation);
		
		
	}

}
