package com.lhs;

/*
 * sync : 한 작업이 끝나고 다음 작업을 수행할 수 있게 접근을 제한하는 것
 */
public class NotSyncMain {

	static Bank bank;
	
	public static void main(String[] args) {
		bank = new Bank(); // 은행 업무 시작
		System.out.println("현재 잔액: " + bank.getMoney());
		
		Me m = new Me(); // 입금 고객
		Wife w = new Wife(); // 출금 고객
		
		m.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}		
		w.start();
	}

}
