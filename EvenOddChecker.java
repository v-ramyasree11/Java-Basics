package conditonalStatements;

import java.util.Scanner;

public class EvenOddChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + " is a  Even Number");
		}
		else {
			System.out.println(num + " is a Odd Number");
		}
	}

}
