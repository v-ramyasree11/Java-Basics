package Datatypes;

import java.util.Scanner;

public class SumTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers to sum");
		System.out.println("*************************************");
		System.out.print("Enter the first number to sum : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the Second number to sum : ");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("The sum of two numbers is : " + sum);
		System.out.println("*************************************");
	}

}
