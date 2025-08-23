package Day6_Arrays;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && num != first) {
				second = num;
			}
		}
		System.out.println("Second Largest number is " + second);
		System.out.println("First Largest number is " + first);
		sc.close();
	}
}
