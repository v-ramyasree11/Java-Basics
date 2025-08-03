package Day3_LoopingStatements;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Palindrome Check");
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int original = n;
		int rev = 0;
		while (n != 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		
		if (original == rev) {
			System.out.println(original + " is a palindrome.");
		} else {
			System.out.println(original + " is not a palindrome.");
		}
		
		sc.close();
	}

}
