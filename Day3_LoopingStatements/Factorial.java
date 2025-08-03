package Day3_LoopingStatements;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Factorial of N Numbers");
		System.out.print("Enter the N number : ");
		int N = sc.nextInt();
		
		int factorial = 1;
		for (int i = 1; i<= N; i++) {
			factorial *= i;
		}
		System.out.println("The Factorial of " + N + " is : " + factorial);
		sc.close();
	}

}
