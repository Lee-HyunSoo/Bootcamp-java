package com.lhs;

public class Wife extends Thread {

	public Wife() {
	}
	
	public void run() {
		NotSyncMain.bank.minusMoney(3000);
		System.out.println("출금 후 잔액: " + NotSyncMain.bank.getMoney());
	}

}
