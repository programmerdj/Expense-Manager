package com.deepak.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deepak.beans.Bank;
import com.deepak.beans.Transaction;


public class expenseService {

	
	public void withdraw(float a){
		System.out.println("Demo..");
	}	
	public Transaction deposit(Transaction transaction){
		System.out.println("Rs."+transaction.getAmount()+" credited");
		return transaction;}
	
/*	public String get(){
		System.out.println("Deepak");
		return "Deepak";}*/
	
	
	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		
		//Bank bank = (Bank) appContext.getBean("Bank");
		
		Transaction transaction = (Transaction) appContext.getBean("Transaction");
	//	System.out.println(transaction.getAmount());
	//	System.out.println(transaction.getDescription());
	//	transaction.withdraw((float)32.23);
		expenseService ex= (expenseService) appContext.getBean("expenseService");
		//ex.withdraw((float) 23.32);
		ex.deposit(transaction);
		
	}
}
