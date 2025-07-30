package Datatypes;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers to swap");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("The 1st number is : " + num1);
		System.out.println("The 2nd number is : " + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("---After Swap---");
		System.out.println("The 1st number is : " + num1);
		System.out.println("The 2nd number is : " + num2);
				
	}
}
