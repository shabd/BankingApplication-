package bankAccountApp;

public class Saving extends Account {
	//// list properties specific to the saving  account
	private int SafetyDepositID;
	private int SafetyDepositkey;
	
	
	// constructor 
	
	public Saving(String name , String Id, double intDeposit) {
		super(name ,Id , intDeposit);
		AccountNumber = "1" + AccountNumber;
		setSaftyDepositBox();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
		
	}
	
	
	
	private void setSaftyDepositBox() {
		SafetyDepositID = (int)(Math.random() * Math.pow(10, 3));
		SafetyDepositkey =(int)(Math.random()*Math.pow(10, 4));
	}
	
	
	// methods specific to savings account 
	public void showInfo() {
		System.out.println();
		super.showInfo();
		System.out.println("Saving Account : " +
							"\nSafety Deposit Box Id :" + SafetyDepositID+
							"\nSafetyDepositkey :" + SafetyDepositkey
							);
		
	}

	

}
