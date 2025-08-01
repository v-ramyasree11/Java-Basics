package conditonalStatements;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the Grade for students Marks");
		System.out.print("Enter the marks : ");
		int marks = sc.nextInt();
		
		if (marks >= 90) {
			System.out.println(marks + " : Grade A");
		} else if (marks >= 75) {
			System.out.println(marks + " : Grade B");
		} else if (marks >= 60) {
			System.out.println(marks + " : Grade C");
		} else if (marks >= 40) {
			System.out.println(marks + " : Grade D");
		} else {
			System.out.println("Fail ! Try again");
		}

	}

}
