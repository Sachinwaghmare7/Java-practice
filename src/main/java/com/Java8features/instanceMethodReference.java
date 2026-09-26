package com.Java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

class Student{
	public Student() {
	System.out.println("student created");
}
}
public class instanceMethodReference {
	public static void main(String[] args) {
		List <String> names = Arrays.asList("sachin","ajay","mahesh","aniket","akshay","akash");
		names.sort(String::compareTo);
		//System.out.println(names); are you use this line prints names in brackets
		
		names.forEach(System.out::println);
		
		
		Supplier<Student> Supplier = Student::new;
		Supplier.get();
	}
}
