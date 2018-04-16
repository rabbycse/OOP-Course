package Overloading;

public class Parent {
	public void Houes() {
		System.out.println("This is Prents Houes");
	}
	public void Bike() {
		System.out.println("This is Parents Bike");
	}

}
 class Child extends Parent{
	public void Bike() {
		System.out.println("This is Child Bike");
	}
}
 
 class Test {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.Bike();
		
		Child c = new Child();
		c.Bike();
		
		Parent p1 = new Child();
		p1.Bike();
		
	}
}
