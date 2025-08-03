package Day3_LoopingStatements;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sum of N Numbers");
		System.out.print("Enter the N Number: ");
		int N = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			sum += i;
		}
		System.out.println("The Sum of " + N + " Numbers is : " + sum);
		sc.close();

	}

}
