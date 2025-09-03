package Day8_OOP;

import java.util.Scanner;

public class Interest {
	double principal, rate;
	int time;
	
	void setValues(double p, double r, int t) {
		principal = p;
		rate = r;
		time = t;
	}
	
	double SimpleInterest() {
		return (principal * rate * time) / 100;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First Object");
		Interest i1 = new Interest(); 
		System.out.print("Enter the PRT values : ");
		i1.setValues(sc.nextDouble(), sc.nextDouble(), sc.nextInt());
		System.out.println("Simple Interest = " + i1.SimpleInterest());
		System.out.print("Enter the updated PPRT values : ");
		i1.setValues(sc.nextDouble(), sc.nextDouble(), sc.nextInt());
		System.out.println("Simple Interest = " + i1.SimpleInterest());
		System.out.println("second Object");
		Interest i2 = new Interest(); 
		System.out.print("Enter the PRT vlaues : ");
		i2.setValues(sc.nextDouble(), sc.nextDouble(), sc.nextInt());
		System.out.println("Simple Interest = " + i2.SimpleInterest());
		sc.close();
	}
}
