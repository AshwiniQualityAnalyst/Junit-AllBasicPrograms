package StringRelatedPrograms;

public class StringCompareequl {

	public static void main(String[] args) {
		stringCompare("ashwini", "ASHWINI");
	}

	private static void stringCompare(String str, String str1)
	{
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
	}
}
