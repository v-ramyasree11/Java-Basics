package Day5Methods;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Factorial Number*****");
		System.out.print("Enter the number : ");
		Long num = sc.nextLong();
		System.out.println("Factorial value of " + num + "! is " + (factorial(num)));
		sc.close();
	}
	static Long factorial(Long n) {
		if(n == 0) {
			return 1l;
		}
		
		return n * factorial(n-1);
	}
}
