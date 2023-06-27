package com.lhs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CafeSalesMethodClass {

	public CafeSalesMethodClass() {
		
	}
	
	public static Map<String, Integer> todaySales(ArrayList<CafeSalesClass> cafeSales) {
		Map<String, Integer> hash = new HashMap<String, Integer>();
	
		for (CafeSalesClass cafe : cafeSales) {
			hash.putIfAbsent(cafe.getItem(), 1);
			hash.computeIfPresent(cafe.getItem(), (k, v) -> v + 1);
		}
		return hash;
	}
	
	public static ArrayList<String> bestSales(ArrayList<CafeSalesClass> cafeSales) {
		ArrayList<String> bestitems = new ArrayList<String>();
		Map<String, Integer> hash = todaySales(cafeSales);
		
		int max = Collections.max(hash.values());
		for (String s : hash.keySet()) {
			if (hash.get(s).equals(max))
				bestitems.add(s);
		}
		return bestitems;
	}
	
	public static ArrayList<String> bestSales2(ArrayList<CafeSalesClass> cafeSales) {
		ArrayList<String> menu = new ArrayList<String>(); // 중복 제거한 메뉴
		ArrayList<Integer> sales = new ArrayList<Integer>(); // 메뉴 당 팔린 갯수
		ArrayList<String> result = new ArrayList<String>(); // 가장 많이 팔린 메뉴들
		
		for (CafeSalesClass cafe: cafeSales) {
			if (!menu.contains(cafe.getItem()))
				menu.add(cafe.getItem());
		}
		
		for (String s: menu) {
			int cnt = 0;
			for (CafeSalesClass cafe: cafeSales) {
				if (cafe.getItem().equals(s)) {
					cnt++;
				}
			}
			sales.add(cnt);
		}
		
		int max = Collections.max(sales);
//		int max = 0;
//		for (int i = 0; i < sales.size(); i++) {
//			if (sales.get(i) > max) {
//				max = sales.get(i);
//			}
//		}
				
		for (int i = 0; i < sales.size(); i++) {
			if (sales.get(i) == max)
				result.add(menu.get(i));
		}
		return result;
	}
}
