package Day8_OOP;

import java.util.Scanner;

class Book {
	String title;
	String author;
	
	void printDetails() {
		System.out.println("Title : " + title + ", Author : " + author);
	}
}
public class BookApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book b = new Book();
		System.out.print("Enter the Title : ");
		b.title = sc.nextLine();
		System.out.print("Enter the author name : ");
		b.author = sc.nextLine();
		b.printDetails();
		sc.close();
	}
}
