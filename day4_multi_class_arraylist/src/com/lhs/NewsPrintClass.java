package com.lhs;

import java.util.ArrayList;

public class NewsPrintClass {

	public NewsPrintClass() {
		
	}
	
	public static void printURL(String press, ArrayList<String> url) {
		for (String s : url)
			System.out.println(press + "�� ��ũ�ּ�: https://" + s);
	}
	
	public static void printCategory(ArrayList<String> categories) {
		System.out.println("-----�ߺ� ���� �� ī�װ�-----");
		for (String s : categories)
			System.out.println(s);
	}
}
