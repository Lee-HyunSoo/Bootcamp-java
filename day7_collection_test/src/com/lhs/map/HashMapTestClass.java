package com.lhs.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapTestClass {

	public HashMapTestClass() {
	}
	
	public static void hashMapTest() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		// public class HashMap implements Map {} 으로 만들어져 있기 때문에 HashMap으로도 선언가능하다.(실무에선 잘 안쓴다.)
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		
		map.put("a", 10); // 데이터 추가 (key, value)
		map.put("a", 20);
		map.put("a", 30); // 이렇게 3개를 넣어도 중복을 허용하지 않기 때문에 (a, 30) 하나만 존재한다.	
		map.put("b", 40);
	
		System.out.println(map.size()); // HashMap의 데이터의 개수 확인
		System.out.println(map.get("b")); // 데이터 추출
		
		Set<String> set = map.keySet(); // HashMap의 key들만 출력, 반환타입이 Set<데이터타입>이다.
		
		// set데이터를 추출하려면 형태를 바꾸어 출력해야한다.
		// 1. LinkedList 형태로 변환
		List<String> list = new LinkedList<String>(set);
		for (String s : list)
			System.out.println(s);
		// 2. Iterator 형태로 변환
		// iterator : 열거형, 데이터를 나열만 하기 때문에 index가 없다. 때문에 while과 iterator가 가지고있는 hasNext()를 사용해 데이터를 추출한다.
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) // 추출할 데이터가 있는지 여부 (true / false)
			System.out.println(iter.next()); // 데이터를 추출
	}
	
	public static void hashMapStudent() {
		Student s1 = new Student(10, "test1");
		Student s2 = new Student(20, "test2");
		Student s3 = new Student(30, "test3");
		Student s4 = new Student(40, "test4");
		
		Map<String, Student> map = new HashMap<String, Student>();
		map.put("a", s1);
		map.put("b", s2);
		map.put("c", s3);
		map.put("d", s4);
		
		System.out.println(map);
		System.out.println(s1);
		for (Map.Entry<String, Student> entry : map.entrySet())
			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		
		for (String s : map.keySet())
			System.out.println("key: " + s + " value: " + map.get(s));
	}

}
