package Abstraction2;

public class Rectangle extends Shape{
	
	Rectangle(double d1, double d2) {
		super(d1,d2);
	}
	
	void area()
	{
		double result = d1*d2;
		System.out.println("Rectangle Area ="+result);
	}

}
