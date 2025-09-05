package Day9_AdavanceOOp;
interface MyInterface {
	void display();
	default void show() {
		System.out.println("Show on Interface");
	}
	static void info() {
		System.out.println("information form the interface");
	}
}
class MyClass implements MyInterface {
	public void display() {
		System.out.println("Abstract display on MyClass");
	}
}

public class InterfaceWithMethods {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.display();
		obj.show();
		MyInterface.info();
	}
}
