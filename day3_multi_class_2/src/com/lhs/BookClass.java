package com.lhs;

public class BookClass {
	String title = null;	// 책 제목
	String author = null;	// 저자
	String press = null;	// 출판사
	int price = 0;			// 정가
	String image = null;	// 책표지
	int dc = 0;				// 할인율
	
	public BookClass() {

	}
	
	public BookClass(String title, String author, String press, int price, String image, int dc) {
		this.title = title;
		this.author = author;
		this.press = press;
		this.price = price;
		this.image = image;
		this.dc = dc;
	}
}
