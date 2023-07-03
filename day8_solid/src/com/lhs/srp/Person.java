package com.lhs.srp;

/*
 * SRP가 지켜지지 않은 경우
 */
public class Person {
	public String job = "";
	
	/*
	 * 기본 생성자는 생략 가능하지만, 반드시 명시적으로 코딩
	 * 기본생성자가 없을 경우, 컴파일 시 기본생성자는 자동으로 만들어진다.
	 * 다만, Java Web 또는 Spring Framework에서는, xml문서를 통해 객체 생성이 이루어지기 때문에 반드시 명시한다.
	 */
	public Person() {
	}
	
	public Person(String job) {
		this.job = job;
	}
	
	/*
	 * 현재 job을 저장하는 책임에, 그 사람의 job을 구별해야하는 책임까지 추가 되었다.
	 * 때문에 추상 메서드로 분리 사용해야 하는 부분인데, 일반클래스라 사용할 수 없다.
	 */
	public void work() {
		if (this.job.equals("Programmer"))
			System.out.println("코딩하는 사람");
		else if (this.job.equals("PM"))
			System.out.println("기획하는 사람");
	}

}
