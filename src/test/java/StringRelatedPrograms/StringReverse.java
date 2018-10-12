package StringRelatedPrograms;

public class StringReverse {

	public static void main(String[] args) {
		ReverseTheString("Ashwini Sharma");

		ReverseTheString1("1 2 3 4 5 6 7 8 9 0");

		ReverseTheString2("Hi");
	}

	static void ReverseTheString(String Original) {
		char[] Reverse = Original.toCharArray();
		for (int i = Reverse.length - 1; i >= 0; i--) {
			System.out.print(Reverse[i]);
		}
		System.out.println();
	}

	static void ReverseTheString1(String Original) {
		String Reverse = new StringBuffer(Original).reverse().toString();
		System.out.print(Reverse);
		System.out.println();
	}

	static void ReverseTheString2(String Original) {
		StringBuilder Reverse = new StringBuilder();
		Reverse.append(Original);
		Reverse = Reverse.reverse();
		System.out.print(Reverse);
		System.out.println();
	}
}
