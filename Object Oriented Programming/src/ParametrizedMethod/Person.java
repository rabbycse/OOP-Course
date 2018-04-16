package ParametrizedMethod;

public class Person {
	String name,gander;
	int age;
	
	 void setinfo(String n,String m,int a) //parametrized method create
	 {
		 name = n;
		 gander = m;
		 age = a;
		
	 }
	 void display()
	 {
		 System.out.println("Name : "+name);
		 System.out.println("Gander : "+gander);
		 System.out.println("Age : "+age);
	 }

}
