package com.lhs;

public class Customer extends Thread {
	Account account = null;
	
	public Customer() {
	}
	
	public Customer(Account account, String name) {
		this.account = account;
		setName(name);
	}
	
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println(getName() + " : " + i + "번째 성금자");
			this.account.deposit();
			if (account.getTotal() >= 500000)
				break;
		}
	}

}
