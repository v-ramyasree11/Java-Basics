package Day5Methods;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("*****GCD*****");
		System.out.print("Enter the first number");
		int n1 = sc.nextInt();
		System.out.print("Enter the second number");
		int n2 = sc.nextInt();
		
		System.out.println("GCD of (" + n1 +", " + n2 + ") " + (gcd(n1, n2)));
	}
	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
