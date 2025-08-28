package Day7_Strings;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text ");
		String str = sc.nextLine();
		int vowels = 0, constant = 0;
		str.toLowerCase();
		for(char c : str.toCharArray()) {
			if("aeiou".indexOf(c) != -1) {
				vowels++;
			}
			else if (c >= 'a' && c <= 'z') {
				constant++;
			}
		}
		System.out.println("Vowels : " + vowels + " Constant : " + constant);
		sc.close();
		
	}
}
