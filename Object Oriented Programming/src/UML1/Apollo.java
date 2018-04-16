package UML1;

import java.util.Scanner;

public class Apollo extends SpaceCraft implements Drive,Shuttle {
	private int gear;

	public Apollo(int gear,String model) {
		super(model);
	     this.gear = gear;
	}
	public void display1()
	{
		System.out.println("Gear:"+gear);
	}
	
	Scanner data = new Scanner(System.in);
	
	public static void main(String[] args) {
		Apollo a = new Apollo(4,"Apollo");
		a.display();
		a.display1();
		a.drive();
		a.turn();
		a.stop();
		a.startShuttle();
		a.stopShuttle();
	}
	public void drive()
	{
		System.out.println("This space craft can be drive!");
	}
	public void stop()
	{
		System.out.println("Press 'o' for stopping this space craft! ");
		int a = data.nextInt();
		
		if(a==0)
		{
			System.out.println("This space craft is stopping soon.");
		}
		else
		{
			System.out.println("Invalid keyword!");
			stop();
		}
	
	}
	public void turn()
	{
		System.out.println("Press '1' for turnnig on!");
		int b = data.nextInt();
		
		if (b==1)
		{
			System.out.println("This space craft is turnnig on.");
		}
		else
		{
			System.out.println("Invalid keyword!");
			turn();
		}
	}
	public void startShuttle()
	{
		System.out.println("Press '2' for start this space craft shuttle!");
		int c = data.nextInt();
		
		if(c==2)
		{
			System.out.println("Shuttle is starting soon.");
		}
		else
		{
			System.out.println("Invalid keyword!");
			startShuttle();
		}
	}
	public void stopShuttle()
	{
		System.out.println("Press '3' for stop this space craft shuttle!");
		int d = data.nextInt();
		
		if(d==3)
		{
			System.out.println("Shuttle is stopping soon.");
		}
		else
		{
			System.out.println("Invalid keyword!");
			stopShuttle();
		}
	}

}
