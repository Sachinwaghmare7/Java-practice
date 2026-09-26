package com.billFactoryMethod;

import java.util.Scanner;
public class GenerateBill {
	public static void main(String[] args) {
		GetPlanFactory planfactory = new GetPlanFactory();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your plan type name after that it will be Generate your bill");
			String planName = sc.next();
			System.out.println("Enter the number of consumed units");
			int units = sc.nextInt();
			plan p = planfactory.getPlan(planName);
			System.out.println("total payble amount is :");
			p.getRate();
			p.CalculateBill(units);
	}

}
