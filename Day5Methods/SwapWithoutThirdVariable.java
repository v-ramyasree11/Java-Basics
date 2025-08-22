package Day5Methods;

import java.util.Scanner;

public class SwapWithoutThirdVariable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Swap number without Third Variable");
		System.out.print("Enter the a : ");
		int a = sc.nextInt();
		System.out.print("Enter the b : ");
		int b = sc.nextInt();
		swap(a,b);
	}
	static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a + " b = " + b);
	}
}
