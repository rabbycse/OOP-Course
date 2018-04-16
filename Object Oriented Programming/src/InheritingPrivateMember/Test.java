package InheritingPrivateMember;

public class Test {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setName("Dr.Motin");
		t.setAge(33);
		t.setQualification("Msc in CSE");
		
		//System.out.println(t.getName());
		//System.out.println(t.getAge());
		//System.out.println(t.getQualification());
		
		t.display();
	}

}
