package BasicPrograms;

public class Armstong {

	public static void main(String[] args) {
		ArmstrongNumber(371);
		ArmstrongNumber(376);
	}

	static void ArmstrongNumber(int number) {
		int remainder = 0;
		int reverse = 0;
		int Temp = number;

		while (number > 0) {
			remainder = number % 10;
			number = number / 10;
			reverse = reverse + (remainder * remainder * remainder);
		}
		if (Temp == reverse) {
			System.out.println(reverse + " is a Armstrong");
		} else {
			System.out.println(reverse + " is not a Armstrong");
		}
	}
}
