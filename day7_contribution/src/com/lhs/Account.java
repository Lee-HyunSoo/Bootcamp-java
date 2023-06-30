package com.lhs;

/*
 * 각 ARS 번호를 통해 1000씩 누적하는 일처리
 */
public class Account {

	private int total = 0;
	
	public Account() {
	}
	
	public void deposit() {
		this.total += 1000;
	}

	public int getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return "Account [total=" + total + "]";
	}
	
}
