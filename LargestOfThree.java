package conditonalStatements;

import java.util.Scanner;

public class LargestOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the lagest number between three numbers");
		System.out.print("Enter the number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number : ");
		int num2 = sc.nextInt();
		System.out.print("Enter the Third number : ");
		int num3 = sc.nextInt();
		
		if(num1 >= num2 && num1 >= num3 ) {
			System.out.println(num1 + " is the Largest number");
		} else if (num1 <= num2 && num2 >= num3) {
			System.out.println(num2 + " is the largest number");
		} else if (num1 <= num3 && num2 <= num3) {
			System.out.println(num3 + " is the largest number");
		}
	}
}
