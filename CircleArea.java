package Datatypes;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double r = sc.nextDouble();
		double pi = 22/7;
		double circleArea = pi * r * r;
		System.out.println("The area of a circle is :" + circleArea);
	}
}
