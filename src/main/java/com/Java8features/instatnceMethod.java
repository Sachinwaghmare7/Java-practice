package com.Java8features;


interface Printer{
	void print(String msg);
	
	
	
	
	
}
interface Printer1{
	void print(int no);
	
}
class MessagePrinter{
	void display(String msg){
		
		System.out.println(msg);
		
		
	}
}
class ValuePrinter{
	void display(int no) {
		System.out.println(no);
	}
}


public class instatnceMethod {
	public static void main(String[] args) {
		MessagePrinter mp = new MessagePrinter();
		ValuePrinter vp = new ValuePrinter();
	     Printer1 r= vp ::display;
		
		Printer p = mp::display;
		
		p.print("hello");
		p.print("12");
	}

}
