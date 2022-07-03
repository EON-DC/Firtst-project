package com.mycalculator.main;

import com.mycalculator.member.Numbers;
import com.mycalculator.service.Calculation;

public class MyCalculator {
	
	public static void main(String[] args) {
		
		Numbers numbers = new Numbers(4, 6);
		Calculation calculation = new Calculation();
		
		
		System.out.println("======================");
		System.out.println("Numbers first num : " + numbers.getFirst_num());
		System.out.println("Numbers second num : "+ numbers.getSecond_num());
		System.out.println("add calculation result = " + calculation.add(numbers));
		
	}

}
