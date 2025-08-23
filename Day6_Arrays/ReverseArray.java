package Day6_Arrays;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Normal Array : ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		int start = 0;
		int end = arr.length-1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.print("Reversed Array : ");
		for (int num : arr) {
			System.out.print(num +" ");
		}
		sc.close();
		
	}
}
