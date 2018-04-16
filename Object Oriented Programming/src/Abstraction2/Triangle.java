package Abstraction2;

public class Triangle extends Shape{
	
	Triangle(double d1, double d2) {
		super(d1,d2);
	}
	
	void area()
	{
		double result = 0.5*d1*d2;
		System.out.println("Triangle Area ="+result);
	}
	

}
