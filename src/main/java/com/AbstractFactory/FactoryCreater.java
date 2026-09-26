package com.AbstractFactory;

public class FactoryCreater {
	 public static AbstractFactory getFactory(String choice) {
		 if(choice.equalsIgnoreCase("BANK")){
		 		return new BankFactory();
		 
	 }
		 else if(choice.equalsIgnoreCase("Loan")) {
			 return new LoanFactory();
			 
		 }
		 return null;

}
}