package _02_The_Wave;

import java.util.ArrayList;

public class _01_TheWave {
	/*
	 * Background: https://en.wikipedia.org/wiki/Wave_%28audience%29
	 * 
	 * Task: Your task is to create a function that turns a string into a Wave. You
	 * will be passed a string and you must return that string in an ArrayList where
	 * an uppercase letter is a person standing up. Example: wave("hello") =>
	 * "Hello", "hEllo", "heLlo", "helLo", "hellO"
	 * 
	 * 1. The input string will always be lower case but maybe empty. 2. If the
	 * character in the string is whitespace then pass over it as if it was an empty
	 * seat.
	 */

	public static ArrayList<String> wave(String str) {
		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				char c2 = Character.toUpperCase(c);
				String empty = "";
				for (int j = 0; j < str.length(); j++) {
					if (i == j) {
						empty += c2;
					} else {
						empty += str.charAt(j);
					}
				}
				strings.add(empty);
			}
		}
		System.out.print(strings);
		return strings;
	}
}
