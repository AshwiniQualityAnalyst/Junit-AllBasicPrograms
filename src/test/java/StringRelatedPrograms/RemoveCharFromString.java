package StringRelatedPrograms;

public class RemoveCharFromString {

	public static void main(String[] args) {

		removeCharFromString("Ashwini Sharma", 'A');
	}

	private static void removeCharFromString(String input, char c)
	{
		String result = input.replaceAll(String.valueOf(c), "");
		System.out.println(result);
	}

}
