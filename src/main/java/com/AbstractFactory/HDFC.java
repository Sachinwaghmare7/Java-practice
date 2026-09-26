package com.AbstractFactory;

public class HDFC implements Bank{
	public final String BNAME;
	
	public HDFC() {
		BNAME ="HDFC Bank";
	}
	public String getBankName() {
		return BNAME;
	}
	
}
