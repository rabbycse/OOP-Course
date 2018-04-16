package Inheritence;

public class Teacher extends Person{
	// name,age extends
	String qualification;
	
	void display2()
	{
		display();
		//System.out.println("Name:"+name);
		//System.out.println("Age:"+age);
		System.out.println("Qualification:"+qualification);
	}

}
