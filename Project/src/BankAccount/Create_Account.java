package BankAccount;

public class Create_Account extends BankAccount {

	Create_Account(String n,int acc_num,int b,String a_t){ 
        name=n;
        Acc_num=acc_num;
        Acc_Balance=b;
        acc_type=a_t;
}
Create_Account(){
    super();
}
    
void insert(String n,int acc_num,String a_t){ 
    name=n;
    acc_type=a_t;
    Acc_num=acc_num;  
    Acc_Balance=0;
}

void display_details(){
    System.out.println("Depositor Name :" +name);
    System.out.println("Account Number : "+Acc_num);
    System.out.println("Account Balance : "+Acc_Balance);
    System.out.println("Account Type : "+acc_type);
}

void deposite(int acc_num,int money){                 
    Acc_Balance=money;    
}
    
int withdraw(int withd){
     Acc_Balance=Acc_Balance-withd;
     return Acc_Balance;
}

}
