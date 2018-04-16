package Association;

public class Association {

	public static void main (String[] args) 
    {
		Bank bank = new Bank("Apolo");
		Employee emp = new Employee("Rabby");
		
        System.out.println(emp.getEmployeeName() + 
               " is employee of " + bank.getBankName());
    }

}
