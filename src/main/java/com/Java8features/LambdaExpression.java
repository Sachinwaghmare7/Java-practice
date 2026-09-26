package com.Java8features;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.List;
import java.lang.String;

public class LambdaExpression {
	public static void main(String[] args) {
		
		List<String> languages = Arrays.asList("c","java","oracle","php","c++");
		System.out.println("languages which starts with j");
		Filter(languages,(str -> str.startWith("j")));
		
		
	}
	public static void filter(List<String> names,predicte<String> condition)
	for(String name:names) {
		if(condition.test(name)) {
			System.out.println(name+" ");
			

		}
	}
}
