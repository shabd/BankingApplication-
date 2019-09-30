package bankAccountApp;

// abstract meaning we can't create classes from the Account class , but can create from checking &
//savings 
public abstract class Account implements BaseRate{

	// list common properties for saving and checking accounts 
	private String name;
	private String Id;
	private double balance;
	protected String AccountNumber; // Protected = can only be accessed by the sub-class 
	protected double rate;
	//double intDeposit;
	
	static int index = 10000 ; // Static = one instance created , shared amongst all instances of the class 
	
	
	
	// Constructor to set base properties  and initialize the account 
	public Account(String name, String Id, double intDeposit) {
		this.name = name;
		this.Id = Id;
		balance = intDeposit;
		
		//setting account number 
		index++;
		this.AccountNumber = setAccountNumber();
		setRate();
		}
	
	
	public abstract void setRate();
	
	// Set Account number 
	private String setAccountNumber() {
		String LastTwo = Id.substring(Id.length()-2, Id.length()); // set from last two digits of the ID Number 
		int uniqueId = index; // middle 5 numbers 
		int randomNumber =(int)(Math.random() * Math.pow(10, 3)); // last three digits of the bank acc number 
		return LastTwo + uniqueId +randomNumber;
		}
	
	// list of common methods
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing R" + amount);
		printBalance();
	}
	public void transfer(String toWhere ,double amount ) {
		balance = balance - amount;
		System.out.println("Transfering R" + amount + "to"+ toWhere);
		printBalance();
	}
	public void withdraw(double amount)
	{
		balance = balance - amount;
		System.out.println("Withdrawimg  R" + amount);
		printBalance();
	}
	 
	public void compound() {
		double accuredInterest = balance * (rate/100);
		balance = balance+ accuredInterest;
		System.out.println("Accrude Interest R" + accuredInterest);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your Balanace is now R" + balance);
	}
	// toString method 
	public void showInfo() {
		System.out.println(
				"\nName:" + name +
				"\nAccount Number:" +  AccountNumber+
				"\nBalance :" + balance +
				"\nRate:" + rate+ "%"
			
				);
		
	}
	
	

	
}
