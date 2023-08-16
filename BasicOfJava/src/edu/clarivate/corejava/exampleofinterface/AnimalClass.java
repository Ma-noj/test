package edu.clarivate.corejava.exampleofinterface;

public class AnimalClass {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();

		Dog dog = new Dog();
		dog.sound();

		Cow cow = new Cow();
		cow.sound();
	}
}
