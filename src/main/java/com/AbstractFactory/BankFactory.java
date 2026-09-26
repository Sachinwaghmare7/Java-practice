package com.AbstractFactory;

public class BankFactory extends AbstractFactory {	
	public Bank getBank(String bank) {
		if (bank == null) {
			return null;
		}
		if(bank.equalsIgnoreCase("SBI"))
			return new Sbi();
		else if(bank.equalsIgnoreCase("HDFC")) {
			return new HDFC();
		}
		else if(bank.equalsIgnoreCase("ICICI")) {
			return new ICICI();
		}
		
		
		return null;
	}
	public Loan getLoan (String loan) {
		return null;
		
	}
	

}
