package Datatypes;
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Full Name");
		String name = sc.nextLine();
		System.out.println("Enter you age");
		int age = sc.nextInt();
		
		System.out.println("Hello " + name + " your age is : " + age);
		
	}
}
