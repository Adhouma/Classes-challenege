package com.learnJava;

public class Bank {
	// Fields
	private int accountNumber;
	private double balance;
	private String customerName;
	private String customerEmail;
	private String customerPhone;

	// Getters and Setters
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	// Methods
	public void depositFunds(double amount) {
		this.balance += amount;
		System.out.println("Opeartion succeeded, You deposit: " + String.format("%.2f", amount) + "$, Now you have: "
				+ String.format("%.2f", this.balance) + "$ in your account");
	}

	public void withdrawFunds(double amount) {
		if (this.balance <= 0) {
			System.out.println("Operation failed, Sorry you have insufficient funds, You have: "
					+ String.format("%.2f", this.balance) + "$ in your account");
		} else if(amount > this.balance) {
			System.out.println("Operation failed, the amount you entered surpass your balance");
		} else {
			this.balance -= amount;
			System.out.println("Opeartion succeeded, You withdrawel: " + String.format("%.2f", amount)
					+ "$, Now you have: " + String.format("%.2f", this.balance) + "$ in your account");
		}
	}

}
