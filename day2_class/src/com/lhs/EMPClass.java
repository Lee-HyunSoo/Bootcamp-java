package com.lhs;

import java.util.ArrayList;

/*
 * main이 없는 클래스는 내부에 생성자가 필요하다.
 * 생성자 : 다른 클래스가 현 클래스를 객체로 만들 때 자동으로 호출되는 메서드(함수)
 * 일반클래스 : main이 없는 클래스, 클래스 파일로는 아무 작업도 하지 못하고, 반드시 객체화 되어야만 일을 할 수 있다.
 * 일반클래스를 객체화 시키기는 방법 : new 클래스명()
 * 클래스 자신의 데이터는 this를 붙여서 사용. 탐색시간이 줄어든다.
 */

/*
 * Overloading : 한 클래스내에서 이미 같은이름을 가진 메소드가 있더라도 같은 이름으로 정의할 수 있는 것
 * 1. 메소드명은 동일해야한다.
 * 2. 매개변수의 개수가 틀리거나, 데이터 타입이 달라야한다.
 * ex) println
 * 
 * Overriding : 부모클래스에서 상속받은 메소드를 자식클래스에서 재정의하는 것
 * 1. 메소드명, 매개변수, 리턴값이 모두 동일해야한다.
 * 2. 내부의 로직은 달라도된다.
 */

/*
 * 메서드
 * 1. 선언위치 : 클래스 내부
 * 2. 선언방법
 *  1) public 반환타입 매서드명() { 로직 }
 *  2) public 반환타입 매서드명() { 로직, 반환값 }
 *  3) public 반환타입 매서드명(파라미터) { 로직 }
 *  4) public 반환타입 매서드명(파라미터) { 로직, 반환값 }
 */

public class EMPClass {
	String name;          // 이름
	String joinDate;      // 가입일
	String lastVisitDate; // 최종방문일
	int numVisit;         // 방문횟수
	String gender;        // 성별
	String age;           // 연령대
	
	// 기본 생성자
	public EMPClass() {
		
	}
	
	// 기본 생성자에 대한 파생 생성자 : Overloading
	public EMPClass(String data) {
		String[] splits = data.split(",");
		this.name = splits[0];
		this.joinDate = splits[1];
		this.lastVisitDate = splits[2];
		this.numVisit = Integer.parseInt(splits[3]);
		this.gender = splits[4];
		this.age = splits[5];
		
		this.setSplit(data);
	}
	
	// 문자열을 각각 분리하여 전역변수에 설정하는 메서드 -> 생성자의 하는일을 줄여줄 수 있다.
	public void setSplit(String data) {
		String[] splits = data.split(",");
		this.name = splits[0];
		this.joinDate = splits[1];
		this.lastVisitDate = splits[2];
		this.numVisit = Integer.parseInt(splits[3]);
		this.gender = splits[4];
		this.age = splits[5];
	}
}
