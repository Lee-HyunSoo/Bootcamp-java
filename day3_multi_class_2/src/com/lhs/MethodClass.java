package com.lhs;

import java.util.ArrayList;

public class MethodClass {

	public MethodClass() {

	}
	
	public static double realPriceMethod(int price, int dc) {
		return price * (100 - dc) * 0.01;	
	}
	
	// 저자 이름으로 책 제목을 검색하는 메서드
	public static ArrayList<String> findBookTitles(String author, ArrayList<BookClass> books) {
		ArrayList<String> titles = new ArrayList<String>();
		for (BookClass book : books) {
			if (book.author.equals(author))
				titles.add(book.title);
		}
		return titles;
	}
}
