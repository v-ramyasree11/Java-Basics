package Day5Methods;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Reverse Number*****");
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		System.out.println("The reverse number for " + num + " is : " + reverse(num));
		sc.close();
	}
	static int reverse(int n) {
		int rev = 0;
		while( n != 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		return rev;
	}
}