/*Inheritance  Task 1-Single Inheritance Vehicle and Car*/
class Vehical  {
	void start() {
		System.out.println("Vehical started");
	}
}

class Car extends Vehical {
	void start() {
		System.out.println("Car started");
	}
}

public class Inheritance1 {
        public static void main(String[] args) {
        	Car c=new Car();
        	c.start();
        }
 }
