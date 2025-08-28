package Day7_Strings;

import java.util.Scanner;

public class CharFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text");
		String str = sc.nextLine();
		int[] freq = new int[256];
		for (char c : str.toCharArray()) {
			freq[c]++;
		}
		for(int i = 0; i < 256; i++) {
			if (freq[i] >0) {
				System.out.println((char) i + " -> " + freq[i]);
			}
		}
		sc.close();
	}
}
