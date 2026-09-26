package com.prscticeSingaleton;

public class Service {
	StdSingleton st = StdSingleton.getInstance();
	
	public void Attendnce(int StudentId) {
		st.executeQuery("student id insert ("+ StudentId +",'present)");
		System.out.println("student id is :"+StudentId);
		
		
	}

}
