package com.Java8features;
import java.util.Arrays;
import java.util.List;



public class StreamAPIDemo {
	public static void main(String[] args) {
		
//	List<Double> salary= Arrays.asList(20232.32,42323.32,322333.23,322423.33);
		
		List<String> names = Arrays.asList("sachin","ajay","ashok","ak sah","akashy");
		
		 names.stream()
		.map(name -> name.toUpperCase()) 	
			.forEach(System.out::print);  	  	
		
		
		 
		
		List<Integer> list = Arrays.asList(10,20,30,40,50,60,70,80,90);
		
		int sum = list.stream()
				.reduce(0,(a,b) -> a+b);
		System.out.println(sum);   	
		
		for(Integer i : list) {
		System.out.print( i + "  ");
		}
		System.out.println();

		list.stream()
		.filter(i 	-> i>30)
		.sorted()
		.distinct()
		.forEach(System.out::print);
				
	}

}
