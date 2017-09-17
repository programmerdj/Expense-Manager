package com.deepak.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import com.deepak.beans.*;

@Aspect
public class LoggingAspect {

	@Before("execution( String get*())")
	public void loggingAdvice(){
		System.out.println("Advice Run..");
	}
	
	@After("execution(* deposit(*)) && args(trans)")
	public void loggingAdviceDeposit(Transaction trans){
		
		System.out.println("Advice after Deposit.."+trans);
	}
	
	@After("execution(* withdraw(*)) && args(trans)")
	public void loggingAdvicewithdraw(Transaction trans){
		
		System.out.println("Advice after withdraw.."+trans);
	}
}
