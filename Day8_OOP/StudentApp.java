package Day8_OOP;

import java.util.Scanner;

class Student { 
	int id;
	String name;
	int marks;
	String grade() {
		switch(marks/10) {
			case 10:
			case 9:
			case 8:
				return("Grade A"); 
		
			case 7:
			case 6:
				return("Grade B"); 
		
			case 5:
			case 4:
				return("Grade C"); 
		
			case 3: return("Grade D"); 
		
			case 2:
			case 1:
			case 0:
				return("Grade F"); 
		
			default :
				return "Invalid marks";
		
		}
	}
	void  display() {
		System.out.println("Id : " + id + ", Name : " + name + ", Marks: " + marks + ", Grade : " + grade());
	}
}
public class StudentApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		System.out.print("Enter the Id : ");
		s1.id = sc.nextInt();
		System.out.print("Enter the Name : "); 
		sc.nextLine();
		s1.name = sc.nextLine();
		System.out.print("Enter the marks : ");
		s1.marks = sc.nextInt();
		s1.display();
		sc.close();
		
	}
}

