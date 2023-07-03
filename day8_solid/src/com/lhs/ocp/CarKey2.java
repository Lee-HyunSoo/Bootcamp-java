package com.lhs.ocp;

/*
 * OCP가 지켜진 경우
 * 대표적으로, 다양한 데이터베이스에 접근가능하게 설계할 수 있다.
 */
public interface CarKey2 {
	public void open();
	public void lock();
	public void turnOn();
	public void turnOff();
}

class Key implements CarKey2 {
	
	public Key() { // 기본생성자
	}

	@Override
	public void open() {
		System.out.println("Key로 열기");
	}

	@Override
	public void lock() {	
	}

	@Override
	public void turnOn() {	
	}

	@Override
	public void turnOff() {
	}
	
}

class SmartKey implements CarKey2 {
	
	public SmartKey() { // 기본생성자
	}
	
	@Override
	public void open() {
		System.out.println("SmartKey로 열기");
	}

	@Override
	public void lock() {	
	}

	@Override
	public void turnOn() {	
	}

	@Override
	public void turnOff() {
	}
	
}