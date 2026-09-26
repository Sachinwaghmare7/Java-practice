package com.Java8features;
//import java.util.function.Supplier;
//import java.util.Random;
//
//public class OTPGeneration {
//	public static void main(String[] args) {
//		Supplier<Integer> otp = () ->
//		new Random().nextInt(9999) +1000;
//		
//		System.out.println("OTP:" +	otp.get());
//	}
//
//}
// 	
import java.util.function.Supplier;
import java.util.Random;
public class OTPGeneration{
	public static void main(String[] args) {
		Supplier<Integer> otp =() ->
		new Random().nextInt(9999) +1000;
		System.out.println("OTP:" + otp.get());
		
	}
}