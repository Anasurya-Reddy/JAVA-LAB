/*Inheritance Task 3-Multilevel Inheritance Animal Hierarchy*/
class Animal {
	void makeSound() {
		System.out.println("Shout!");
	}
}

class Dog extends Animal {
	void makeSound() {
		System.out.println("Woof!");
	}
}

class Puppy extends Dog {
	void makeSound() {
		System.out.println("Yap!");
	}
}

public class Inheritance3 {
	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Puppy p = new Puppy();
		a.makeSound();
		d.makeSound();
		p.makeSound();
	}
}
