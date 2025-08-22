package Day5Methods;

import java.util.Scanner;

public class SumOfNnumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sum of N natural numbers");
		System.out.println("enter the number to sum : ");
		int n = sc.nextInt();
		System.out.println("The sum of " + n + " numbers is : " +sum(n));
	}
	static int sum(int n ) {
		if (n==0) {
			return 0;
		}
		return n + sum(n-1);
	}
}
