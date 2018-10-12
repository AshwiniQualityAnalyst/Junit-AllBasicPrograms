package StringToughPrograms;

public class SwaptwoStrings {

	public static void main(String[] args) {

		String First = "Ashwini";
		String Second = "Sharma";

		// Print String before swapping
		System.out.println("Strings before swap: First = " + First + " and Second = " + Second);

		// append 2nd string to 1st
		First = First + Second;

		// store intial string First in string Second
		Second = First.substring(0, First.length() - Second.length());

		// store initial string Second in string First
		First = First.substring(Second.length());

		// print String after swapping 
		System.out.println("Strings after swap: First = " + First + " and Second = " + Second);
	}
}
