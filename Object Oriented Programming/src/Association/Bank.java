package Association;

public class Bank {
	private String name;
    Employee emp = new Employee(name); 
	public Bank(String name) {
		this.name = name;
	}
	public String getBankName() {
		return name;
	}

}
 
