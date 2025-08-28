package Day7_Strings;

import java.util.Scanner;

public class UpperCaseManual {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text");
		String str = sc.nextLine();
		String result = "";
		for (char c : str.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				result += (char) (c-32);
			}
			else {
				result += c;
			}
		}
		System.out.println("UPPER CASE TEXT : " + result);
		sc.close();
	}
}
