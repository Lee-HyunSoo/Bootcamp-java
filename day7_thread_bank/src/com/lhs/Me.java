package com.lhs;

public class Me extends Thread {

	public Me() {
	}
	
	public void run() {
		SyncMain.bank.saveMoney(5000);
		System.out.println("입금 후 잔액: " + SyncMain.bank.getMoney());
	}

}
