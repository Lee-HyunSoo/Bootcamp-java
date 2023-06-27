package com.lhs;

import java.util.ArrayList;

public class PrintClass {

	public PrintClass() {

	}

	public static void prn(String title, double price) {
		System.out.println("제목: " + title + " 실 판매가: " + price);		
	}
	
	public static void prn(String author, ArrayList<String> titles) {
		for(String title : titles)
			System.out.println(title);
	}
}
