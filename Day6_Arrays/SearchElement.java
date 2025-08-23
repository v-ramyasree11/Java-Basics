package Day6_Arrays;

import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the value to Search");
		int key = sc.nextInt();
		boolean found = false;
		for (int num : arr) {
			if (num == key) {
				found = true;
				break;
			}
		}
		System.out.println(found ? "Key found" : "key not found");
		sc.close();
	}
}
