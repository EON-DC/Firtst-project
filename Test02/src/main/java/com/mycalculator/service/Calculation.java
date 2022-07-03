package com.mycalculator.service;

import com.mycalculator.member.Numbers;

public class Calculation {
	
	private Numbers numbers;
	
	public Calculation() {
		// TODO Auto-generated constructor stub
	}
	
	public Calculation(Numbers numbers) {
		this.numbers = numbers;
	}



	public int add(Numbers numbers) {
		return numbers.getFirst_num()+numbers.getSecond_num();
	}

}
