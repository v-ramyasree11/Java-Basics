package Day6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Before: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("After: ");
		for(int num : arr) {
			System.out.print(num + " ");
		}
		sc.close();
		
	}
}
