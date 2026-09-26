package com.String22Api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Employee {
	public static void main(String[] args) {
		List <String> employee = Arrays.asList("sachin","rahul","ashok","akshay","Nikhil","akash");
//		List <Integer> rollNo = Arrays.asList(12,21,43,64,65,66); 
//		List<String> Employee1 = Employee1.stream()
		List <Double> sallary  = Arrays.asList(10000.32,20000.32,30000.34,40000.54,50000.54);
		
		
//		rollNo.stream();
		employee.stream();
		System.out.println("Employee name List:");	
		employee.forEach(System.out::println);
//		rollNo.forEach(System.out::println);
		Employee hs = sallary.stream()
				max(Comparator.comparing(::getsallary))
				.get()
		System.out.println(hs);
				
		
	}


}
