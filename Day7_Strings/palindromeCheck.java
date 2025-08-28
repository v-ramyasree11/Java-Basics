package Day7_Strings;

import java.util.Scanner;

public class palindromeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text");
		String str = sc.nextLine();
		String rev = new StringBuilder(str).reverse().toString();
		System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
		sc.close();
	}
}
