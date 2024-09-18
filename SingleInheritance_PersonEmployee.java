/*Inheritance Task 2-Single Inheritance super keyword Person and Employee*/
class Person {
	String name;
	int age;
	Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("Name: " + name + "	Age: " + age);
	}
}

class Employee  extends Person {
	double sal;
	Employee(String name,int age,double sal) {
		super(name,age);
		this.sal=sal;
	}
	void display() {
		System.out.println("Name: " + name + "	Age: " + age + "	Salary: $" + sal );
	}
}

public class Inheritance2 {
	public static void main(String[] args) {
		Person p= new Person("Siva",19);
		Employee e=new Employee("surya",20,15000.00);
		p.display();
		e.display();
	}
}
