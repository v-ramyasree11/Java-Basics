package Day6_Arrays;

import java.util.Scanner;

public class MaxElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of a Array");
		int[] numbers = new int[sc.nextInt()];
		System.out.println("ENter the values");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Max : " + max);
		sc.close();
	}
}
