package Abstraction2;

public class Circle extends Shape{ 
	// d1,d1 
	//area = 3.1416*r*r
	Circle(double r)
	{
		super(r,r);
	}
	
	void area()
	{
		double result = Math.PI*d1*d2;
		System.out.println("Circle Area ="+result);
	}

}
