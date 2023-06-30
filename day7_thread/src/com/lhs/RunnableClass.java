package com.lhs;

public class RunnableClass implements Runnable{

	@Override
	public void run() {
		System.out.println("override된 run() 내부");
	}
	
	public void start() {
		this.run();
	}

}
