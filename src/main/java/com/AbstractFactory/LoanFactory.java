package com.AbstractFactory;

public class LoanFactory extends AbstractFactory{
	public Bank getBank(String bank) {
		return null;
	}
public Loan getLoan(String loan) {
	if(loan == null) {
		return null;
	}
	if(loan.equalsIgnoreCase("HOME")) {
		return new HomeLoan();
	}
	else if(loan.equalsIgnoreCase("BUSINESS")) {
		return new BusinessLoan();
		
	}
	else if(loan.equalsIgnoreCase("EDUCATIONALx	")) {
		return new EducationalLoan();
		
	}
	return null;
}
}
