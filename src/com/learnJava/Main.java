package com.learnJava;

public class Main {
	/**
	 * Create a new class for a bank account
	 * Create fields for the account:
	 * account number, balance, customer name, email and phone number.
	 * 
	 * Create getters and setters for each fields
	 * Create two additional methods
	 * - To allow the customer to deposit funds (This method increment the balance field)
	 * - To allow the customer to withdraw funds (This method should deduct from the balance field)
	 * 
	 * PS:
	 * You cannot withdraw if you have insufficient funds.  
	 */
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setAccountNumber(12345);
		bank.setBalance(10_000.00);
		bank.setCustomerEmail("abbassi.abdeladhim31791@gmail.com");
		bank.setCustomerName("Abdeladhim Abbassi");
		bank.setCustomerPhone("+216 54 867 610");
		
		System.out.println("/*--- Bank ---*/");
		System.out.println("Hello Mr " + bank.getCustomerName());
		System.out.println("You have: " + String.format("%.2f", bank.getBalance()) + "$ in your account");
		
		bank.depositFunds(5_000.00);
		bank.withdrawFunds(1_000.00);
		bank.withdrawFunds(17_000.00);
	}
}
