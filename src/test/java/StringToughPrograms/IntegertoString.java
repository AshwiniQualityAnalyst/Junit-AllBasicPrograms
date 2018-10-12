package StringToughPrograms;

public class IntegertoString {

	public static void main(String[] args) {
		
		UseIntegerToStringMethod(2);
		
		UseValueOfMetod(2);
	}
	
	static void UseIntegerToStringMethod(int Number) {
		String str = Integer.toString(Number);
		System.out.println(str);
	}
	
	static void UseValueOfMetod(int Number) {
		Object string = String.valueOf(Number);
		System.out.println(string);
	}

}
