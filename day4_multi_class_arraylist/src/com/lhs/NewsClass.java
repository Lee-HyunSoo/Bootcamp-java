package com.lhs;

public class NewsClass {
	String press = null; // 신문사
	String image = null; // 대표이미지
	String url = null; // 링크주소
	String category = null; // 종류
	
	public NewsClass() {
		
	}
	
	public NewsClass(String press, String image, String url, String category) {
		this.press = press;
		this.image = image;
		this.url = url;
		this.category = category;
	}
}
