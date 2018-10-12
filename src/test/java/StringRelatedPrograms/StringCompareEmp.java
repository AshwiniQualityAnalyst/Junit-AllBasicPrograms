package StringRelatedPrograms;

public class StringCompareEmp {
	public static void main(String[] args) {

		stringCompare("Ashwini", "ashwini");
	}

	private static void stringCompare(String str1, String str2)
	{
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
	}
}
