package Day5Methods;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Prime Number*****");
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		boolean isPrime = CheckPrime(num);
		if(isPrime) {
			System.out.println(num + " is a Prime Number");
		} else {
			System.out.println(num + " is not a Prime Number");
		}
		sc.close();
	}
	static boolean CheckPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
