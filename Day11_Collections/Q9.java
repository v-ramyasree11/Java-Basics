package Day11_Collections;

import java.util.HashMap;
import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word name");
		String word = sc.nextLine();
		HashMap<Character, Integer> freq = new HashMap<>();
		System.out.println("Hash Map : " + freq);
		for (char c : word.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}
		System.out.println("Frequency of " + word + " is : " + freq);
		sc.close();
		
	}
}
