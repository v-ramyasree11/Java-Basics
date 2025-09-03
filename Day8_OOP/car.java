package Day8_OOP;

public class car {
	String brand;
	String model;
	double price;
	
	void display() {
		System.out.println("Brand : " + brand + " Model : " + model + " Price : " + price);
	}
}
class carApp {
	public static void main(String[] args) {
		car c1 = new car();
		c1.brand = "Tesla";
		c1.model = "model s";
		c1.price = 750000;
		c1.display();
	}
}
