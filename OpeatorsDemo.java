package Basics;

import java.util.Scanner;

public class OpeatorsDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		
		System.out.println("Addition : " +(a + b));
		System.out.println("Substraction : " + (a - b));
		System.out.println("Multiplication : " + (a * b));
		if(b!=0)
			System.out.println("Division : " + (a / b));
		else
			System.out.println("can't divide with Zero");
		System.out.println("Modulus : " + (a % b));
		System.out.println("a > b : " +(a > b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a != b : " + (a!=b));
		System.out.println("a || b : " + ((a>b) || (b<a)));
		System.out.println("a && b :" + ((a<b) && (b>a)));		
	}
}
