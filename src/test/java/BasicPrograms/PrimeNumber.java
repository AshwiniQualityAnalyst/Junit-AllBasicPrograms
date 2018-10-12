package BasicPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		CheckPrimeNumber(3);
		CheckPrimeNumber(4);
	}

	static void CheckPrimeNumber(int number) {
		int divide = number / 2;
		int flag = 0;

		for (int i = 2; i <= divide; i++) {
			if (number % i == 0) {
				System.out.println(number + " is not a Prime Number");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(number + " is a Prime Number");
		}
	}
}
