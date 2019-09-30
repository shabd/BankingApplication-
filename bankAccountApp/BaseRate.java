package bankAccountApp;

public interface BaseRate {

	// method that returns the base rate 
	// rate determined by outside factors 
	default double getBaseRate() {
		return 2.5;
	}
	
}
