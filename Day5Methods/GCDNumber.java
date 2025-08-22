package Day5Methods;

import java.util.Scanner;

public class GCDNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****GCD*****");
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number : ");
		int num2 = sc.nextInt();
		int result = gcd(num1, num2);
		System.out.println("GCD (" + num1 +", " + num2 +") : " + result);
	}
	static int gcd(int a, int b) {
		while (b!=0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
