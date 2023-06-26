package com.lhs;

public class StudentClass {
	String sNo = null;
	String firstNo = null;
	String lastNo = null;
	String sName = null;
	int year = 0;
	String local = null;
	int grade = 0;
	
	public StudentClass() {
		
	}
	
	public StudentClass(String sNo, String jumin, String sName, int year, String local, int grade) {
		this.sNo = sNo;
		String[] tmp = jumin.split("-");
		this.firstNo = tmp[0];
		this.lastNo = tmp[1];
		this.sName = sName;
		this.year = year;
		this.local = local;
		this.grade = grade;
	}
}
