package com.prscticeSingaleton;

public class PayFee {
	
	StdSingleton st = StdSingleton.getInstance();
	
	public void feepaid(int StudentId) {
		st.executeQuery("this student are paid fees ("+StudentId +"),'10000'");
		System.out.println("student are fee paid: " + StudentId);

	}
	
	


}
