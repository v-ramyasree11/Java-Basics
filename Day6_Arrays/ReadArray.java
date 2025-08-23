package Day6_Arrays;

import java.util.Scanner;

public class ReadArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of a Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int num : arr) {
			System.out.print(num+" ");
		}
		sc.close();
	}
}
