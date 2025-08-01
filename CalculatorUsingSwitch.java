package conditonalStatements;

import java.util.Scanner;

public class CalculatorUsingSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculator");
		System.out.print("Enter fist number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		
		System.out.println("Select the peration to perforam \n "
				+ "+, -, *, / ");
		char op = sc.next().charAt(0);
		
		switch(op) {
			case '+': 
				System.out.println("The sum of " + num1 +" and " + num2 +" is : " + (num1 + num2));
				break;
			case '-':
				System.out.println("The substraction of " + num1 +" and " + num2 + " is : " + (num1 - num2));
				break;
			case '*':
				System.out.println("The multiplication of " + num1 + " and " + num2 + " is : " + (num1 * num2));
				break;
			case '/':
				if(num2!=0) {
					double division = num1/num2;
					System.out.println("The Division of " + num1 + " and " + num2 +" is : " + division);
				} else {
					System.out.println("can't divide with Zero");
				}
			default:
				System.out.println("Invaild option");
		}
	}
}
