package com.lhs;

public class ThreadName extends Thread{

	public ThreadName() {
	}
	
	public ThreadName(String name) {
		super(name); // 부모의 private 변수에 값을 전달
	}
	
	public void run() {
		// thread가 해야할 일들
		int i = 0;
		while (i < 20) {
			System.out.println(getName() + ": " + i); // super로 전달한 값을 getter로 가져옴
			i++;
		}
	}

}
