package com.mycalculator.member;

public class Numbers {
	private int first_num;
	private int second_num;

	public Numbers() {
	}

	public Numbers(int first_num, int second_num) {
		super();
		this.first_num = first_num;
		this.second_num = second_num;
	}

	public int getFirst_num() {
		return first_num;
	}

	public void setFirst_num(int first_num) {
		this.first_num = first_num;
	}

	public int getSecond_num() {
		return second_num;
	}

	public void setSecond_num(int second_num) {
		this.second_num = second_num;
	}

}
