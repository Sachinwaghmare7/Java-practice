package com.billFactoryMethod;

abstract class plan {
	protected double rate;
	
	abstract void getRate();
	
	
	public void CalculateBill(int units) {
		System.out.println(units*rate);
	}

}
