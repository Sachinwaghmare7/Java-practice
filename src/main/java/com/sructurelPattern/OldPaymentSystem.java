package com.sructurelPattern;


interface Payment {
	void pay(int amount); 
}

//Adapter
public class OldPaymentSystem {
	void makePayment(int amount) {
		System.out.println("paid using old system:" + amount);
	}
			 	
		}
    class PaymentAdapter implements Payment{
	private OldPaymentSystem oldSystem =  new OldPaymentSystem();
	
	public void pay(int amount) {
		oldSystem.makePayment(amount);
		
	}
	
	
}
