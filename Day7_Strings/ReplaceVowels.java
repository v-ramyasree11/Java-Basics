package Day7_Strings;

import java.util.Scanner;

public class ReplaceVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text");
		String str = sc.nextLine();
		System.out.println(str.replaceAll("[AEIOUaeious]", "*"));
		sc.close();
	}
}
