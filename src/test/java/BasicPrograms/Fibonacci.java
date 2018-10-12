package BasicPrograms;

public class Fibonacci {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8.....
		Fibonacci(0, 1, 10);
	}

	static void Fibonacci(int n1, int n2, int count) {
		int n3;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i <= count; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println();
	}

}
