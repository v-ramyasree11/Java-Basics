package Day8_OOP;

import java.util.Scanner;

class Employee {
	String name;
	int age;
	
	Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void show() {
		System.out.println("Name : " + name + ", Age : " + age);
	}
}
public class EmployeeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name and age");
		Employee e = new Employee(sc.nextLine(), sc.nextInt());
		e.show();
		sc.close();
	}
}
