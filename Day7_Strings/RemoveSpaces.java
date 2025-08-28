package Day7_Strings;

import java.util.Scanner;

public class RemoveSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence with text");
		// using trim only before and after the text removed
		/*String str = sc.nextLine();
		System.out.println(str.trim()); */
		// using replace for between words and before and after text 
		String str = sc.nextLine();
		System.out.println(str.replace(" " , ""));
		sc.close();
		
	}
}
