package Day5Methods;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Armstrong Number");
		System.out.println("Enter the number to check : ");
		int num = sc.nextInt();
		boolean result = Check(num);
		if(result) 
			System.out.println("This number is Armstrong number");
		else 
			System.out.println("This is not a Armstrong number");
	}
	static boolean Check(int n) {
		int temp = n;
		int sum = 0;
		int digit = String.valueOf(n).length();
		while(temp != 0) {
			int d = temp % 10;
			sum += Math.pow(d, digit);
			temp /= 10;
		}
		return sum == n;
	}
}
