package com.Java8features;


interface Calculator{
	int add(int a, int b);
	
}
class MathUtil{
	static int sum(int a, int b) {
		return a+b;
	}
}
public class staticMethod {
	public static void main(String[] args) {
//	Calculator c = (a,b) -> MathUtil.sum(a,b);
	Calculator c = MathUtil::sum;
	System.out.println(c.add (30,90));

}
}

