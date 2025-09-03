package Day8_OOP;

import java.util.Scanner;

class Person {
	String name;
	int age;
	
	// default constructor 
	Person() {
		name = "Unknown";
		age = 0;
	}
	Person(String n, int a) { 
		name = n;
		age = a;
	}
	void display() {
		System.out.println("Name : " + name + ", Age : " + age);
	}
}
public class PersonApp {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Default Constructor");
		Person p1 = new Person();
		p1.display();
		System.out.println("Parameterized Constructor");
		System.out.print("Enter your name and age : ");
		Person p2 = new Person(sc.nextLine(), sc.nextInt());
		p2.display();
		sc.close();
	}
}
