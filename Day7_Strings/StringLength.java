package Day7_Strings;

import java.util.Scanner;

public class StringLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string[text] to Fing the Length");
		String str = sc.nextLine();
		System.out.println(str.length());
		sc.close();
	}
}
