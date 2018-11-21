package com.cg.dto;

public class Wallet {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Wallet(double amount) {
		// TODO Auto-generated constructor stub
		this.balance = amount;
	}

	@Override
	public String toString() {
		return "Wallet [balance=" + balance + "]";
	}
	
	
	
}
