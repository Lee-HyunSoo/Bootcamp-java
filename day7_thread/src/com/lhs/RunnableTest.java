package com.lhs;

public class RunnableTest implements Runnable {
	
	int count = 0;
	int num = 0;
	boolean timeout = false;

	public RunnableTest() {
	}
	
	public RunnableTest(int count) {
		this.count = count;
	}

	@Override
	public void run() {
		while (!timeout) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			num++;
			if (count <= num)
				timeout = true;
		}
		System.out.println(Thread.currentThread().getName() + " : " + num); // 현재 구동중인 thread가 누구인지 알아내는 메서드	
	}

}
