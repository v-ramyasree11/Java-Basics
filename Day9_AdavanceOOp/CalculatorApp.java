package Day9_AdavanceOOp;
class Calculator {
	 int add (int a, int b) {
		 return a + b;
	 }
	 double add (double a, double b) {
		 return a + b;
	 }
}

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		// Complie time polymorphism [ method overloading]
		System.out.println(c.add(12, 13));
		System.out.println(c.add(12.3, 322.2));

	}

}
