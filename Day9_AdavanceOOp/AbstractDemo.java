package Day9_AdavanceOOp;
abstract class Shape {
	abstract void area();
}
class Circle extends Shape {
	int r = 5;
	public void area() {
		System.out.println("Area of Cicle : " + (3.14) * r * r);
	}
}
class Rectangle extends Shape {
	int l = 2, b = 3;
	public void area() {
		System.out.println("Area of Rectangle : " + (l * b));
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		Shape s1 = new Circle();
		s1.area();
		Shape s2 = new Rectangle();
		s2.area();
	}
}
