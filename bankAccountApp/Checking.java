package bankAccountApp;

public class Checking extends Account {
	
	// list properties specific to the checking account
	private int DebitCardNumber;
	private int DebitCardPin;
	
	
	// constructor to initialize the checking account properties 
	public Checking (String name ,String Id ,double intDeposit) {
		super(name ,Id , intDeposit);
		AccountNumber = "2" + AccountNumber;
		setDebitCard();
		
	}
	@Override 
	public void setRate() {
		//System.out.println("Implement Rate for checking  ");
		rate = getBaseRate() * 0.15;
	}
	private void setDebitCard() {
		DebitCardNumber = (int)(Math.random()*Math.pow(10, 12));
		DebitCardPin =(int)(Math.random()*Math.pow(10, 4));
		
	}
	// list any methods specific to the checking account 
	public void showInfo() {
		super.showInfo();
		System.out.println("Checking Account : " +
				"\nDebit Card Number :" + DebitCardNumber+
				"\nDebitCardPin :" + DebitCardPin);
	}

}
