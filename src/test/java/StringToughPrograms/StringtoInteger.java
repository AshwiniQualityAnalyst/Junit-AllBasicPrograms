package StringToughPrograms;

public class StringtoInteger {

	public static void main(String[] args) {
		UseParseIntMethod("10");
		UseParseIntMethod("-10");

		UseValueOfMetodWhenString("20");
		UseValueOfMetodWhenString("-20");
		
		UseValueOfMetodWhenInteger(30);
		UseValueOfMetodWhenInteger(-30);

	}

	static void UseParseIntMethod(String Number) {
		int number = Integer.parseInt(Number);
		System.out.println(number);
	}

	static void UseValueOfMetodWhenString(String String) {
		Object string = Integer.valueOf(String);
		System.out.println(string);
	}

	static void UseValueOfMetodWhenInteger(int Number) {
		Object number = Integer.valueOf(Number);
		System.out.println(number);
	}



}
