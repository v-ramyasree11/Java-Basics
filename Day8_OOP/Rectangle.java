package Day8_OOP;

class rectangleCal {
	int length;
	int breadth;
	
	void initialize(int l, int b) {
		length = l;
		breadth = b;
	}
	
	int area() {
		return length * breadth;
	}
}
public class Rectangle {
	public static void main(String[] args) {
		rectangleCal r1 = new rectangleCal();
		r1.initialize(12, 13);
		System.out.println("Area = " + r1.area());
		r1.initialize(12, 14); // same object but updated values
		System.out.println("Area = " + r1.area());
	}
}
