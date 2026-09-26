package com.String22Api;

interface name{
	void m1();
	void m2();
	void m3();
	
}




class test implements name{
	public void  m3() {
		System.out.println("sachin");
		System.out.println("sachin");
	}
	  public void m1(){
		  
		 
		
	}
	public void  m2() {
		
	}
	/*.
	 * .
	 * .
	 * .
	 * .
	 * .
	
	*/
	void m100() {
		
	}
}

public class ImplementAdapter {
	public static void main(String[] args) {
		name na = new test();
		na.m3();
	}
}


