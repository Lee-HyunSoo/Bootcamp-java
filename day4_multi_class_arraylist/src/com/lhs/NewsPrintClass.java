package com.lhs;

import java.util.ArrayList;

public class NewsPrintClass {

	public NewsPrintClass() {
		
	}
	
	public static void printURL(String press, ArrayList<String> url) {
		for (String s : url)
			System.out.println(press + "의 링크주소: https://" + s);
	}
	
	public static void printCategory(ArrayList<String> categories) {
		System.out.println("-----중복 제거 된 카테고리-----");
		for (String s : categories)
			System.out.println(s);
	}
}
