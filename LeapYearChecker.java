package conditonalStatements;

import java.util.Scanner;

public class LeapYearChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the Leap Year");
		System.out.print("Enter the Year : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + " is a Leap Year");
		} else {
			System.out.println(year +" is not a Leap Year");
		}
	}
}