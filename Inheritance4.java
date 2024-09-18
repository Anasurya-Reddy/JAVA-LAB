/*Inheritance Task 4-Hierarchical Inheritance Shape Hierarchy*/
class Shape {
	double getArea() {
		return 0;
	}
}

class Rectangle extends Shape {
	double length;
	double width;
	Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	double getArea() {
		return length*width;
	}
}

class Circle extends Shape {
	double radius;
	Circle(double radius) {
		this.radius=radius;
	}
	double getArea() {
		return 3.14*radius*radius;
	}
}

public class Inheritance4 {
	public static void main(String[] args) {
		Shape s  = new Shape();
		Rectangle r = new Rectangle(10,20);
		Circle c = new Circle(7);
		System.out.println("Area of Shape: " + s.getArea());
		System.out.println("Area of Rectangle: " + r.getArea());
		System.out.println("Area of Circle: " + c.getArea());
	}
}
