package Day7_Strings;

import java.util.Scanner;

public class Largestword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str = sc.nextLine();
		String[] words = str.split(" ");
		String maxword = "";
		for (String w : words) {
			if (w.length() > maxword.length()) {
				maxword = w;
			}
		}
		for (String w : words) {
			if(w.length() == maxword.length()) {
				System.out.println(w + " ");
			}
		}
		sc.close();
	}
}
