package com.AbstractFactory;

public class ICICI implements Bank {
	private final String BNAME;
	public ICICI() {
		BNAME = "ICICI bank";
	}
	public String getBankName() {
		return BNAME;
	}
	

}


