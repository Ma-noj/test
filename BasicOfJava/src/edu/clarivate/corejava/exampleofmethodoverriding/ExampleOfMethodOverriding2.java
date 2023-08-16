package edu.clarivate.corejava.exampleofmethodoverriding;

public class ExampleOfMethodOverriding2 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		double bankRateOfInterest = bank.getRateOfInterest();
		System.out.println("Bank Rate Of Interest " + bankRateOfInterest);

		SBI sbi = new SBI();
		double sbiRateOfInterest = sbi.getRateOfInterest();
		System.out.println("SBI Rate Of Interest " + sbiRateOfInterest);

		YesBank yesBank = new YesBank();
		double yesBankRateOfInterest = yesBank.getRateOfInterest();
		System.out.println("Yes Bank Rate Of Interest " + yesBankRateOfInterest);

		HDFC hdfc = new HDFC();
		double hdfcBankRateOfInterest = hdfc.getRateOfInterest();
		System.out.println("HDFC Bank Rate Of Interest " + hdfcBankRateOfInterest);

	}

}
