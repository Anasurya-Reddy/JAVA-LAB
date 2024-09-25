class Vehical {
	Vehical() {
			System.out.println("This is a Vehical");
		}
}

class FourWheeler extends Vehical {
	FourWheeler() {
			System.out.println("This is a FourWheeler");
		}
}

class Car extends FourWheeler {
	Car() {
		System.out.println("This is a Car");
	}
}

public class Constructor_Inheritance {
	public static void main(String[] args) {
		Vehical v = new Vehical();
		FourWheeler f = new FourWheeler();
		Car c = new Car();
	}
}
