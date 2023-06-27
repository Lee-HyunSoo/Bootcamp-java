package com.lhs;

import java.util.ArrayList;
import java.util.Map;

public class CafeSalesPrintClass {

	public CafeSalesPrintClass() {

	}
	
	public static void prnTodaySales(Map<String, Integer> items) {
		System.out.println("----- 오늘 판매 된 상품들 -----");
		for (Map.Entry<String, Integer> entry : items.entrySet())
			System.out.println("상품명: " + entry.getKey() + ", 갯수: " + entry.getValue());
	}
	
	public static void prnBestSales(ArrayList<String> bestitems) {
		System.out.println("----- 2017-09-13에 가장 많이 판매된 상품명 -----");
		for (String s : bestitems)
			System.out.println(s);
	}
}
