package StringRelatedPrograms;

public class StringReplaceEmp {

	public static void main(String[] args) {

		stringReplace("Hello World");
	}

	private static void stringReplace(String str) 
	{
		System.out.println(str.replace("H", "W"));
		System.out.println(str.replaceFirst("He", "Wa"));
		System.out.println(str.replaceFirst("Hello", "Waqwe"));
		System.out.println(str.replaceFirst("World", "Ashwi"));
		System.out.println(str.replaceAll("Hello World", "o k"));
	}
}
