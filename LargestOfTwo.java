package conditonalStatements;
import java.util.Scanner;
public class LargestOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Find the Largest number between Two numbers");
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("The largest number is: " + num1);
		} else if (num1 < num2) {
			System.out.println("The largest number is: " + num2);
		} else {
			System.out.println("Both numbers are equal: " + num1);
		}
		
	}

}
