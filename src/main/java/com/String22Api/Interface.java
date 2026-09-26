package com.String22Api;


interface calculator{
	default void add(int a, int b) {
		info();
		System.out.println("Result of Addition:" + (a+b));
		end();
		
	}

private void info() {
	System.out.println("calculation Started...");
}
private void end() {
	System.out.println("calculation ended...");
}
}
class calculation implements calculator{
	
}


public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator cal = new calculation() ;
		cal.add(12, 20);

	}

}
