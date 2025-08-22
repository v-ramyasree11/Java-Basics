package Day5Methods;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Palindrome Number*****");
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		if(isPalindrome(num)) {
			System.out.println(num + " is a palindrome");
		} else {
			System.out.println(num + " is not a Palindrome");
		}
		sc.close();
	}
	static boolean isPalindrome(int num) {
		return num == ReverseNumber.reverse(num);
	}

}
