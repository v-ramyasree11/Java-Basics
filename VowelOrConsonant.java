package conditonalStatements;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the letter vowel or consonant");
		System.out.print("Enter the character to FInd");
		char ch = sc.next().toLowerCase().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is a vowel.");
		} else if (Character.isLetter(ch)) {
			System.out.println(ch + " is a consonant.");
		} else {
			System.out.println("This is not a Character.");
		}
	}
}
