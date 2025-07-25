package Basics;
import java.util.Scanner;
public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		
		System.out.println("Addition: " + (num1 + num2));
		System.out.println("Substraction: " + (num1 - num2));
		System.out.println("Multiplication: " + (num1 * num2));
		if(num2 != 0) {
			System.out.println("Division : " + (num1 / num2));
		} else {
			System.out.println("Can't divisible by Zero");
		}
		
	}
}
