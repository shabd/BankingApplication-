package bankAccountApp;

import java.util.List;

public class BankAccountApplication {
	
	public static void main(String[]args ) {
		
		String file = "Users/shaiv/Dropbox/NewBankAccount.csv";
		
	/*
    Checking check1  = new Checking("Tom ford","9701205558087",1500);
	Saving save1 = new Saving("James frank","955555555",2000);
	save1.showInfo();
	System.out.println("**************");
	check1.showInfo();
	
*/
	// Read csv file 
		List<String[]> newCustomers = bankAccountApp.CSV.read(file);
	for(String[] accountholder : newCustomers ) {
		//System.out.println("New Account");
		String name =accountholder[0];
		String Id =accountholder[1];
		String accountType = accountholder[2];
		Double Deposit = Double.parseDouble(accountholder[3]);
		System.out.println(name + " " + Id+ " " +accountType+" " + Deposit );
		//Determine Account type 
		if(accountType.contentEquals("Savings")) {
			System.out.println("Opening a savings Account");
		}else if(accountType.contentEquals("Checking")) {
			System.out.println("Opening a checking account Account");
		}else {
			System.out.println("Error , cant read Account type ");
		}
	}
	}

	
	

}
