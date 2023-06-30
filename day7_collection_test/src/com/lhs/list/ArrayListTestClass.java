package com.lhs.list;

import java.util.ArrayList;

public class ArrayListTestClass {

	public ArrayListTestClass() {
	}
	
	public static void arrayListTest() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
	
		list.add(1, "a"); // 특정 위치를 지정하여 데이터를 추가
		list.set(2, "f"); // 특정 위치의 데이터를 다른 데이터로 변경
		list.remove(0); // 특정 위치의 데이터를 제거
		String result = list.remove(0); // 특정 위치의 데이터를 제거하고 반환
		int index1 = list.indexOf("f"); // 특정 데이터의 index를 앞에서부터 찾아 반환
		int index2 = list.lastIndexOf("f"); // 특정 데이터의 index를 뒤에서부터 찾아 반환
	}

}
