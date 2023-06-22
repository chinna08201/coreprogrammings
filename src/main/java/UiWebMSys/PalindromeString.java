package UiWebMSys;

import java.util.Scanner;

public class PalindromeString {

	public void stringPalindrom() {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String original_String = str;

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}

		if (original_String.equals(rev)) {

			System.out.println(original_String + " is a Palindrome " + rev);

		} else {
			System.out.println(original_String + " is NOT a Palindrome " + rev);
		}
	}
	
	public static void main(String[] args) {
		
		new PalindromeString().stringPalindrom();
	}

}
