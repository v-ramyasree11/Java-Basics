package Day9_AdavanceOOp;
class Animal {
	String color = "white";
}
class Dog extends Animal {
	String color = "black";
	public void display() {
		System.out.println("Dog color : " + color);
		System.out.println("Animal Color : " + super.color);
	}
}
public class AnimalDemo {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.display();
	}
}
