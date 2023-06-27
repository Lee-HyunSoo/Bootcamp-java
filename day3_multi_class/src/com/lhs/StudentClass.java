package com.lhs;

public class StudentClass {
	String sNo = null;
	private String firstNo = null;
	private String lastNo = null;
	String sName = null;
	int year = 0;
	String local = null;
	int grade = 0;
	
	public StudentClass() {
		
	}
	
	public StudentClass(String sNo, String jumin, String sName, int year, String local, int grade) {
		this.sNo = sNo;
		String[] tmp = jumin.split("-");
		this.setFirstNo(tmp[0]);
		this.setLastNo(tmp[1]);
		this.sName = sName;
		this.year = year;
		this.local = local;
		this.grade = grade;
	}

	public String getFirstNo() {
		return firstNo;
	}

	public void setFirstNo(String firstNo) {
		this.firstNo = firstNo;
	}

	public String getLastNo() {
		return lastNo;
	}

	public void setLastNo(String lastNo) {
		this.lastNo = lastNo;
	}
}
