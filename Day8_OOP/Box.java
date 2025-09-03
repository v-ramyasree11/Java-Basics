package Day8_OOP;
class RectangleArea {
	int length, breadth;
	
	RectangleArea() {
		length = 1;
		breadth = 1;
	}
	RectangleArea(int l, int b) {
		length = l;
		breadth = b;
	}
	
	int area() {
		return length * breadth;
	}
}
public class Box {
	public static void main(String[] args) {
		RectangleArea r1 = new RectangleArea();
		System.err.println("Default constructor Area : " + r1.area());
		RectangleArea r2 = new RectangleArea(12, 2);
		System.out.println("Customized constructor Area : " + r2.area());
	}
}
