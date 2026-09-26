package com.AbstractFactory;
import java.util.Scanner;


public class GetLoan {
	
	
	public static void main(String args[]) {
		
		
	BankFactory bankname = new BankFactory();

//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter your your bank name:");
//	String Bankname =sc.next();
//	LoanFactory loanType = new LoanFactory();
//	System.out.println("you can type your lona type which type of loan you want:");
//	String LoanType = sc.next();
//	System.out.println("enter your interest on your loan:");
//	int rate = sc.nextInt();
//	System.out.println("enter your loan amount:");
//	double amount = sc.nextDouble();
//	System.out.println("enter years you have how many years :");
//	int year = sc.nextInt();
//	Loan l =  AbstractFactory.getFactory(Loan);
	
	BusinessLoan loan =new BusinessLoan();
	loan.calculateLoanPayment(50000, 4);
	
	}
}
