package com.prscticeSingaleton;

public class StdSingleton {
	// singleton instance 
	private static StdSingleton instance;
	
	
	private StdSingleton() {
		System.out.println("database created");
		
	}
	//globle access point  //
	public static StdSingleton getInstance() {
		if(instance == null) {
			instance = new StdSingleton();
		}
		return instance;
	}
	public void executeQuery(String Query) {
		System.out.println("executeQuery :"+Query);
		
	}

}
