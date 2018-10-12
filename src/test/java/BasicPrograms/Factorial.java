package BasicPrograms;

public class Factorial {

	public static void main(String[] args) {
		factorialWithoutRecurssion(5);

		// Another Method

		int fact = 1;
		int number = 5;
		System.out.println("Factorial using Recursion: " + factorialUsingRecurion(number));
	}

	static void factorialWithoutRecurssion(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial value Without Recursion: " + fact);
	}

	static int factorialUsingRecurion(int number) {
		if (number == 0) {
			return 1;
		} else {
			return (number * factorialUsingRecurion(number - 1));
		}
	}
}
