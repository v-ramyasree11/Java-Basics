package Day6_Arrays;

import java.util.Scanner;

public class CountEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int even = 0, odd = 0;
		for(int num : arr) {
			if(num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.print("Even: " + even + " Odd: " + odd);
		sc.close();
	}
}
