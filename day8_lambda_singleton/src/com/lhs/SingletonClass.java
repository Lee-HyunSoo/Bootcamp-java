package com.lhs;

/*
 * Singleton : 자바 디자인 패턴 중 대표적인 패턴
 * 
 * 하나의 어플리케이션에 단 하나의 객체만 존재하도록 설계하는 패턴
 * 1. 객체 저장 변수는 static을 이용하여 공유 객체로 선언
 * 2. 생성자는 반드시 private로 선언해 외부에서 객체를 생성하지 못하도록 한다
 * 3. public 메서드를 이용하여 생성 된 객체를 반환 받는다.
 * 예) Workbook.createWritable() 처럼 주로 DB에 접근할 때 사용한다.
 */
public class SingletonClass {

	public static SingletonClass single = null;
	
	private SingletonClass() {
	}
	
	public static SingletonClass getInstance1() {
		single = new SingletonClass();
		return single;
	}
	
	public static void getInstance2() {
		single = new SingletonClass();
	}
	
}
