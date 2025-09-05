package Day9_AdavanceOOp;
interface Animal1 {
	void sound();
}
class Dog1 implements Animal1 {
	public void sound() {
		System.out.println("Dog braks");
	}
}
class Cat implements Animal1 {
	public void sound() {
		System.out.println("Cat memow");
	}
}
public class AnimalApp {
	public static void main(String[] args) {
		Animal1 dog = new Dog1();
		dog.sound();
		Animal1 cat = new Cat();
		cat.sound();
	}
}
