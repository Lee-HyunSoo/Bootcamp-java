package com.lhs;

/*
 * 한 회원의 정보를 하나로 묶어주는 역할
 * Model 역할
 */
public class MemberClass {
	int a = 100;
	static int b = 20;
	
	// 클래스 변수는 자동초기화 되긴 하지만, 위험할 수 있기 때문에 직접 초기화해주는게 좋다.
	String pno = null; 		// 교수 사번  
	String firstNo = null; 	// 주민등록 앞자리
	String lastNo = null; 	// 주민등록 뒷자리 
	String pname = null; 	// 교수 이름         	 
	int cCode = 0; 			// 클래스(반) 코드      
	String pJob = null; 	// 교수직책           
	int hireDate; 			// 입사연도
	
	public MemberClass() {
		System.out.println("MemberClass 생성자 호출");
	}
	
	// 7개 데이터를 전달 받는 생성자
	// ("92001", "590327-1839240", "이태규", 920, "교수", "1997")
	public MemberClass(String pno, String jumin, String pname, int cCode, String pjob, String hireDate) {
		this.pno = pno;
		String[] tmp = jumin.split("-");
		this.firstNo = tmp[0];
		this.lastNo = tmp[1];
		this.pname = pname;
		this.cCode = cCode;
		this.pJob = pjob;
		this.hireDate = Integer.parseInt(hireDate);
	}
}
