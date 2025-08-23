package Day6_Arrays;

import java.util.Scanner;

public class AvgArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		double avg = (double)sum / arr.length;
		System.out.println("Average : " + avg);
		sc.close();
	}
}
