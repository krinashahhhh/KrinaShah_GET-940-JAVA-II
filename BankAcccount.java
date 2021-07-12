class Account
{
	private int accountNo;
	private double accountBalance;
	private String accountPassword;
	private static String BankName;
	
	static void setBankName(String Name) 
	{
		 System.out.println("Set Bank Name...");
		 Account.BankName = Name;
		 System.out.println("Bank Name: " + Name);
	}

public Account(int accountNo, double accountBalance , String accountPassword)
{
		this.accountBalance  = accountBalance;
		this.accountPassword = accountPassword;
		this.accountNo       = accountNo;
 }
   
 
void displayAccount() 
{
	System.out.println("Displaying the details of the Member..");
	System.out.println("Account Number   : " + accountNo);
	System.out.println("Account Balance  : " + accountBalance);
	System.out.println("Account Password : " + accountPassword);
	
}
}
public class BankAcccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account.setBankName("CITY BANK"); 
		
		Account a = new Account(1010, 20000, "Krinu");
		a.displayAccount();
	
	}

}
