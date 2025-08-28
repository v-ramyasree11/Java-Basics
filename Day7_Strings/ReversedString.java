package Day7_Strings;

import java.util.Scanner;

public class ReversedString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text to Reverse");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		String rev = sb.reverse().toString();
		System.out.println("Reversed Text: " + rev);
		sc.close();
	}
}
