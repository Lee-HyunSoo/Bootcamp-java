package com.lhs.ocp;

/*
 * OCP가 지켜지지 않은 경우
 * 만약 SmartPhoneKey라는 클래스를 만들게 될 경우, 내부기능 메서드를 또 만들어줘야한다.
 * 때문에 OCP가 지켜지지 않았다고 볼 수 있다.
 */
public class CarKey { // 대표 클래스
	
	CarA myCar;
	
	public CarKey() {
	}
	
	public CarKey(CarA car) {
		this.myCar = car;
	}
	
	public void open() {
		System.out.println("문열림");
	}
	
	public void turnOn() {
		System.out.println("시동걸림");
	}
	
	public void turnOff() {
		System.out.println("시동 끔");
	}
	
	public void lock() {
		System.out.println("문닫힘");
	}

}

class CarA { // 서브 클래스
	
	public CarA() {
	}
	
}
