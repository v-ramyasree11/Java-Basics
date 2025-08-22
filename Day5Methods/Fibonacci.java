package Day5Methods;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Fibonacci Series*****");
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		for(int i = 0; i <= num; i++) {
			System.out.println(fibonacci(i) + " ");
		}
		sc.close();
	}
	static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
