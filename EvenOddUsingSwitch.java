package conditonalStatements;

import java.util.Scanner;

public class EvenOddUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Find the number Eve or Odd Using Switch statement");
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		
		switch(Math.abs(number % 2)) {
			case 0: 
				System.out.println(number + " is a Even number");
				break;
			case 1: 
				System.out.println(number +" is a Odd number");
				break;
	
		}
	}

}
