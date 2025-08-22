package Day5Methods;

import java.util.Scanner;

public class Powers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******Powers*****");
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		System.out.print("Enter the power digit : ");
		int d = sc.nextInt();
		System.out.println("The " + n +" power of " + d + " is " + power(n, d));
		sc.close();
	}
	static int power(int a, int b) {
		if (b == 0) {
			return 1;
		}
		return a * power(a, b - 1);
	}
}
