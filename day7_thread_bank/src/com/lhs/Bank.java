package com.lhs;

public class Bank {

	private int money = 10000;
	
	public Bank() {
	}

	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	// 입금 처리 메서드
	/*
	 * synchronized 키워드를 붙이면 먼저들어온 것이 실행 될 때 동안 다른 실행을 막는다.
	 * synchronized는 메서드 선언부에 선언할 수도 있고, 내부에 선언할 수도 있다.
	 * 왜냐하면 우리가 만든 메서드는 선언부에 선언할 수 있지만, 만약 부모에게서 상속받은 메서드가 있다면 선언부를 변경할 수 없기 때문이다.
	 */
	public void saveMoney(int money) {
		synchronized(this) {
			try {
				Thread.sleep(3000); // 입금 처리 시간
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			this.setMoney(this.money + money); // 현재 잔액 + 입금액
		}
	}
	
	// 출금 처리 메서드
	public synchronized void minusMoney(int money) {
		try {
			Thread.sleep(200); // 출금 처리 시간
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		this.setMoney(this.money - money);
	}
	
}
