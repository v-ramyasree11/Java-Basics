package Day6_Arrays;

import java.util.Scanner;

public class SumArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size array");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		System.out.println("Sum : " + sum);
		sc.close();
	}
}
