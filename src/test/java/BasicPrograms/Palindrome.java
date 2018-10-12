package BasicPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Palindrome("ASA");
		Palindrome("ASHWINI");
		Palindrome("121");
		Palindrome("123");
		
		PalindromeTraditional(121);
		PalindromeTraditional(1212);
	}

	static void Palindrome(String Original) {
		String Reverse = "";

		int Length = Original.length();

		for (int i = Length - 1; i >= 0; i--) {
			Reverse = Reverse + Original.charAt(i);
		}
		if (Original.equalsIgnoreCase(Reverse)) {
			System.out.println(Reverse + " is a Palindrome");
		} else {
			System.out.println(Reverse + " is not a Palindrome but it's a Reverse");
		}
	}

	static void PalindromeTraditional(int number) {
		int remainder = 0;
		int reverse = 0 ;
		int Temp = number;

		while(number > 0)
		{
			remainder = number % 10;
			reverse = (reverse * 10) + remainder;
			number = number / 10;
		}
		if(Temp == reverse)
		{
			System.out.println(reverse + " is a Palindrome");
		}
		else
		{
			System.out.println(reverse + " is not a Palindrome but it's a Reverse");
		}
	}

}
