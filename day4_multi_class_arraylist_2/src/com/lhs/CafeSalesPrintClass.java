package com.lhs;

import java.util.ArrayList;
import java.util.Map;

public class CafeSalesPrintClass {

	public CafeSalesPrintClass() {

	}
	
	public static void prnTodaySales(Map<String, Integer> items) {
		System.out.println("----- ���� �Ǹ� �� ��ǰ�� -----");
		for (Map.Entry<String, Integer> entry : items.entrySet())
			System.out.println("��ǰ��: " + entry.getKey() + ", ����: " + entry.getValue());
	}
	
	public static void prnBestSales(ArrayList<String> bestitems) {
		System.out.println("----- 2017-09-13�� ���� ���� �Ǹŵ� ��ǰ�� -----");
		for (String s : bestitems)
			System.out.println(s);
	}
}
