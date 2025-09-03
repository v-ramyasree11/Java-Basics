package Day8_OOP;

public class calculator {
	int add(int a, int b) {
		return a + b;
	}
	double add(double a, double b) {
		return a + b;
	}
	public static void main(String[] args) {
		calculator c = new calculator();
		System.out.println("Sum (int) = " + c.add(12, 12));
		System.out.println("Sum (double) = " + c.add(12.9, 2.1));
		
	}
}
