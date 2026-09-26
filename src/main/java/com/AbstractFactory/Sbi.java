package com.AbstractFactory;

public class Sbi implements Bank{
	
	private final String BNAME;
	public Sbi() {
		BNAME = "Sbi bank";
	}
	public String getBankName() {
		return BNAME;
	}
	

}
