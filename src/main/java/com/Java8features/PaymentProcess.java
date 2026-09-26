package com.Java8features;

//@FunctionalInterface   // functional interface allow only one abstract class//
interface Payment{
	void pay(double amount);
	
}

public class PaymentProcess {
	public static void main(String[] args) {
		
	
	Payment CreditCard = amount ->
	System.out.println("paid :" + amount  + " Using creditCard"	 );
	
	Payment debitCard = amount ->
	System.out.println("paid :" + amount  + " Using debitCard"	 );
	
	Payment upi = amount ->
	System.out.println("paid :" + amount  + " UPI"	 );
	
	upi.pay(23228.09);
	CreditCard.pay(923472.02);
	debitCard.pay(93723.38);

}
}
