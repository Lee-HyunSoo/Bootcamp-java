package com.lhs;

public class SleepThread extends Thread {

	public SleepThread() {
	}
	
	public void run() {
		System.out.println("sleep Start");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("sleep End");
	}

}
