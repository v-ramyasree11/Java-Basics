package conditonalStatements;

import java.util.Scanner;

public class DivisibleBy5And11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Find number the Divisible by 5 and 11");
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		if(number % 5 == 0 && number % 11 == 0) {
			System.out.println(number + " is divisible by 5 and 11");
		} else {
			System.out.println(number + " is not divisible by 5 and 11");
		}
	}
}
