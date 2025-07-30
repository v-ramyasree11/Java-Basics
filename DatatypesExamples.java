package Datatypes;
import java.util.Scanner;
public class DatatypesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your age");
		byte age = sc.nextByte();
		System.out.println("Enter your Landline number");
		Short LandlineNumber = sc.nextShort();
		System.out.println("Enter you salary");
		int salary = sc.nextInt();
		System.out.println("Enter your mobile phone number");
		long phoneNumber = sc.nextLong();
		System.out.println("Are you married?");
		boolean married= sc.nextBoolean();
		System.out.println("Enter your Gender:(M/F)");
		char gender = sc.next().charAt(0);
		
		System.out.println("Check your Details:");
		System.out.println("Your name: " + name);
		System.out.println("Your age : " + age);
		System.out.println("Your Landline Number : " + LandlineNumber);
		System.out.println("Your salary : " + salary );
		System.out.println("Your Phone NUmber : "+ phoneNumber);
		System.out.println("Your married ? : " + married);
		System.out.println("Your gender : " + gender);
		
	}

}
