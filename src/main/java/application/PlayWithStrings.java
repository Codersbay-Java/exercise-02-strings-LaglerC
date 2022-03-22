package application;

import java.util.Arrays;

public class PlayWithStrings {
	public static void main(String[] args) {
		System.out.println("Hello String World");

		String fn = "hans";
		String ln = "shan";

		printIntitials(fn, ln);
		anagrams(fn, ln);

	}

	/**
	 * TODO: print initials
	 * 
	 * This method should print out the initials of a name to standard out.
	 * 
	 * @param firstname
	 * @param lastname
	 */
	public static void printIntitials(String firstname, String lastname) {
		String fn = firstname.substring(0, 1);
		String ln = lastname.substring(0, 1);
		System.out.println(fn + ". " + ln + ".");

	}

	/**
	 * TODO: check for anagrams
	 * 
	 * This method should determine if two strings are anagrams or not An anagram is
	 * a word or a phrase made by transposing the letters of another word or phrase.
	 * For example, "parliament" is an anagram of "partial men," and "software" is
	 * an anagram of "swear oft." The program should ignore white space and
	 * punctuation.
	 * 
	 * @param value1
	 * @param value2
	 * @return true if the values are anagrams, false otherwise.
	 */
	public static boolean areAnagrams(String value1, String value2) {
		char[] cA1 = value1.toCharArray();
		char[] cA2 = value2.toCharArray();

		Arrays.sort(cA1);
		Arrays.sort(cA2);

		if (cA1.equals(cA2)) {
			System.out.println("true");
			return true;
		}
		System.out.println("false");
		return false;

	}

//	double  --> Double.parseDouble(String);
//	float   --> Float.parseFloat(String);
//	long    --> Long.parseLong(String);
//	int     --> Integer.parseInt(String);
//	char    --> stringGoesHere.charAt(int position);
//	short   --> Short.parseShort(String);
//	byte    --> Byte.parseByte(String);
//	boolean --> Boolean.parseBoolean(String);

	/**
	 * TODO: palindrone checker
	 * 
	 * This method should find out if a string value is a palindrome or not. A
	 * palindrome is a sequence of characters (can also be a number) which reads the
	 * same backwards as forwards. Some palindromes are: Anna; wow; Eva can I see
	 * bees in a cave?
	 * 
	 * Upper or lower case should not matter, but keep the white spaces, tabs and
	 * punctuation in mind.
	 * 
	 * @param value
	 * @return true if it is a palindrome, false otherwise.
	 */
	public static boolean isPalindrome(String value) {
		return false;
	}

	public static void anagrams(String value1, String value2) {
		char[] cA1 = value1.toCharArray();
		char[] cA2 = value2.toCharArray();

		Arrays.sort(cA1);
		Arrays.sort(cA2);

		System.out.println(Arrays.toString(cA2));
	}
}
