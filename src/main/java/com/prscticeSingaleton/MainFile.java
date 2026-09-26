package com.prscticeSingaleton;

public class MainFile {
	public static void main(String[] args) {
		
	
	Service s1 = new Service();
	PayFee fee1 =new PayFee();
	 
	
	//providing singleton 
	s1.Attendnce(101);
	fee1.feepaid(101);
	
	
	StdSingleton st1 = StdSingleton.getInstance();
	StdSingleton st2 = StdSingleton.getInstance();

	
}
}
