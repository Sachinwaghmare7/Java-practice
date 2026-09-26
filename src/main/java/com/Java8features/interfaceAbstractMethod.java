package com.Java8features;

import java.util.function.Consumer;
import java.util.function.Function;


public class interfaceAbstractMethod {
	public static void main(String[] args) {
		


Function<String,String> toUpper = name ->
name.toUpperCase();
System.out.println(toUpper.apply("ajay"));
Consumer<String> SendEmail =email ->
System.out.println("sendig email to " + email);
SendEmail.accept("ajay22@gmail.com");
}
}