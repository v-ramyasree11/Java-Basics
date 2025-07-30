package conditonalStatements;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number 1 :");
		double num1 = sc.nextDouble();
		System.out.print("Enter the number 2 :");
		double num2 = sc.nextDouble();
		
		System.out.println("Addition : " + (num1 + num2));
		System.out.println("Substraction : " + (num1 - num2));
		System.out.println("Multiplication : " + (num1 * num2));
		if(num2 != 0) {
			System.out.println("Division : " + (num1 / num2));
		} else {
			System.out.println("can't divide by zero");
		}
	}
}
