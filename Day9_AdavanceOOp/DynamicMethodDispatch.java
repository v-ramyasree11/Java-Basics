package Day9_AdavanceOOp;
class parent {
	void show() {
		System.out.println("Parent show");
	}
}
class child extends parent {
	void show() {
		System.out.println("Child show");
	}
}
public class DynamicMethodDispatch {
	public static  void main(String[] args) {
		parent p = new child(); // runtime polymorphism
		p.show();
	}
}
