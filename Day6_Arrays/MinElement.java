package Day6_Arrays;

import java.util.Scanner;

public class MinElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of a Array");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Min : " + min);
		sc.close();
	}
}
