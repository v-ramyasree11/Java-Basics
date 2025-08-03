package Day3_LoopingStatements;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Multiplication Table");
		System.out.print("Enter the Table Number :");
		int n = sc.nextInt();
		for (int i = 1; i <= 10 ; i++) {
			System.out.println(n + " X " + i + " = " + (n * i));
		}
		sc.close();
	}

}
