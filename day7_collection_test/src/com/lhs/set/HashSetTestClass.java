package com.lhs.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTestClass {

	public HashSetTestClass() {
	}
	
	public static void hashSetTest() {
		Set<String> set = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		set.add("a"); // 데이터 입력
		set.add("b");
		set.add("c");
		set.add("d");
		System.out.println(set.size()); // 데이터 크기
		
		// 전체 데이터 추출 : iterator로 변환, Set.iterator()
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext())
			System.out.println(iter.next());
	}
	
}
