package Aggregation;

public class Employee {
	String name;
	int id;
	Address address;
	public Employee(String name, int id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public void display() {
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("City:"+address.City);
		System.out.println("District:"+address.District);
		System.out.println("Country:"+address.Country);
	}
	
	  public static void main(String[] args) {
		  Address a = new Address("Dhanmonddi","Dhaka","Bangladesh");
		  Employee e = new Employee("Rabby",1,a);
		  e.display();
	}
		
	}
	
