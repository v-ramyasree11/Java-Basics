package Day7_Strings;

import java.util.Scanner;

public class AnagramCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the s1 : ");
		String s1 = sc.nextLine();
		System.out.println("Enter the s2 : ");
		String s2 = sc.nextLine();
		sc.close();
		if (s1.length() != s2.length() ) {
			System.out.println("Not Anagram");
			return;
		}
		int[] freq = new int[26];
		for (char c : s1.toCharArray()) {
			freq[c - 'a']++;
		}
		for (char c : s2.toCharArray()) {
			freq[c - 'a']--;
		}
		for (int f : freq) {
			if (f != 0) {
				System.out.println("Not Anagram");
				return;
			}
		}
		System.out.println("Anagram");
	}
}
