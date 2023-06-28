package com.naver.news;

/*
 * Model, 한 신문사 정보 저장
 */
public class NaverNewsClass {
	String press = null;
	String image = null;
	String uri = null;
	String category = null;

	public NaverNewsClass() {
	}
	
	public NaverNewsClass(String press, String image, String uri, String category) {
		this.press = press;
		this.image = image;
		this.uri = uri;
		this.category = category;
	}

	public NaverNewsClass(String image, String uri) {
		this.image = image;
		this.uri = uri;
	}	
}
