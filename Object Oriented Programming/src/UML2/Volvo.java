package UML2;

import java.util.Scanner;

public class Volvo extends Vehicle implements Drive{
	private double price;

	public Volvo(String model, double price) {
		super(model);
		this.price = price;
	}
	public void display1()
	{
		System.out.println("Price :" +price);
	}
	Scanner data = new Scanner(System.in);
	public static void main(String[] args) {
		Volvo v = new Volvo("Apollo",443.6);
		v.display();
		v.display1();
		v.startEngine();
		v.stopEngine();
	}
	public void startEngine()
	{
		System.out.println("Press '1' for start engine!");
		int a = data.nextInt();
		
		if(a==1)
		{
			System.out.println("This engine is starting soon.");
		}
		else
		{
			System.out.println("Invalid keyword!");
			startEngine();
		}
	}
	public void stopEngine()
	{
		System.out.println("Press '0' for start engine!");
		int b = data.nextInt();
		
		if(b==0)
		{
			System.out.println("This engine is stopping soon.");
		}
		else
		{
			System.out.println("Invalid keyword!");
			startEngine();
		}
	}

}
