package StringRelatedPrograms;

public class StringToUpperCaseEmp {

	public static void main(String[] args) {

		stringToUpperCase("string abc to upper case ");
	}

	private static void stringToUpperCase(String str)
	{
		String strUC = str.toUpperCase();
		System.out.println(strUC);
	}

}
