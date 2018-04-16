package BankAccount;


public class BankAccount {
	String name,acc_type;
    int Acc_num,Acc_Balance;
	
	public BankAccount() {
	
	}

	public BankAccount(String name, String acc_type, int acc_num, int acc_Balance) {
		super();
		this.name = name;
		this.acc_type = acc_type;
		Acc_num = acc_num;
		Acc_Balance = acc_Balance;
	}


}
