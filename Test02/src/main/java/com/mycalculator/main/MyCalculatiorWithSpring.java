package com.mycalculator.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.mycalculator.member.Numbers;
import com.mycalculator.service.Calculation;

public class MyCalculatiorWithSpring {
	
	public static void main(String[] args) {
		
//		Numbers numbers = new Numbers(4, 6);
//		Calculation calculation = new Calculation();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		Numbers numbers = ctx.getBean("Numbers",Numbers.class);
		Calculation calculation = ctx.getBean("Calcul",Calculation.class);
		
		
		
		System.out.println("======================");
		System.out.println("Numbers first num : " + numbers.getFirst_num());
		System.out.println("Numbers second num : "+ numbers.getSecond_num());
		System.out.println("add calculation result = " + calculation.add(numbers));
		
	}

}
