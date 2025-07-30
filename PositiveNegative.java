package conditonalStatements;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check [Postive / Negative]");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("This number is postive");
		} else if (num == 0) {
			System.out.println("This number is Zero (neither positive nor negative). ");
		}
	
	}
	
}
