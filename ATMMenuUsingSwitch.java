package conditonalStatements;

import java.util.Scanner;

public class ATMMenuUsingSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 10000;
		System.out.println("Welcome to ATM Menu");
		System.out.println("choose your option");
		System.out.print("1.Check balance\n2.Withdraw\n3.Deposit\n4.Exit");
		int option = sc.nextInt();
		
		switch(option) {
			case 1:
				System.out.println("Your balance" + balance);
				break;
			case 2:
				System.out.print("Enter amount to withdraw : ");
				int withdraw = sc.nextInt();
				if (withdraw <= balance) {
					balance -= withdraw;
					System.out.println("Please take you amount");
					System.out.println("Remining balance : " + balance);
				} else {
					System.out.println("Invalid amount");
				}
				break;
			case 3:
				System.out.print("Enter how much amount you deposit");
				int deposit = sc.nextInt();
				balance += deposit;
				System.out.println("updated balance : " + balance);
				break;
			case 4: 
				System.out.println("Thank you for using ATM menu");
				break;
			default: 
				System.out.println("Invaild Option Choose");
		}
	}
}
