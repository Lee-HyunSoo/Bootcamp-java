package com.lhs;

public class FakeThread {

	public FakeThread() {
	}
	
	public void run() {
		int i = 0;
		while(i < 20) {
			System.out.println(i);
			i++;
		}
	}
	
	public void start() {
		this.run();
	}

}
