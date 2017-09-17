package com.deepak.beans;

public class Bank {

	String name;
	float balance;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + balance;
	}
}
