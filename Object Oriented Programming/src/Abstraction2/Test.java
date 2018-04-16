package Abstraction2;

public class Test {
	public static void main(String[] args) {
		
		Shape r = new Rectangle(10,20);
		r.area();
		
		Shape t = new Triangle(10,20);
		t.area();
		
		Shape c = new Circle(10);
		c.area();
		
	}

}
