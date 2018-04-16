package ClassObject;

public class Test {
	public static void main(String[] args) {
		Teacher t; // object declared
		t = new Teacher(); // object create
		
		t.name = "Raju";
		t.gander = "Male";
		t.phone = 1723910526;
		
		System.out.println("Name :"+t.name);
		System.out.println("Gender :"+t.gander);
		System.out.println("Phone :"+t.phone);
		
		Teacher t2 = new Teacher(); // object create
		
		t2.name = "Rabby";
		t2.gander = "Male";
		t2.phone = 176439754;
		
		System.out.println("Name :"+t2.name);
		System.out.println("Gender :"+t2.gander);
		System.out.println("Phone :"+t2.phone);
	}

}
