package com.naver.news;

/*
 * Model, �� �Ź��� ���� ����
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
