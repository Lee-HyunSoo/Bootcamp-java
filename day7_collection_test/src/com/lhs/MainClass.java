package com.lhs;

import com.lhs.list.ArrayListTestClass;
import com.lhs.map.HashMapTestClass;
import com.lhs.map.Student;
import com.lhs.set.HashLotto;
import com.lhs.set.HashSetTestClass;

/*
 * Collections : 자료구조
 * 자료구조 : 여러 데이터를 담아두고, 필요할 때마다 꺼내어 사용하기 위한 구조
 * 
 * Collections의 공통 메서드
 * 1. 데이터 담기 : add(), addAll()
 * 2. 데이터 확인 : contains(), containsAll(), isEmpty(), equals(), size()
 * 3. 데이터 삭제 : clear(), remove(), removeAll()
 * 
 * List interface
 * 각 데이터의 위치(순서)를 나타내는 index가 존재
 * index를 이용하여 원하는 위치의 데이터를 꺼내거나, 삭제, 변경 등을 할 수 있다.
 * List는 중복값을 허용하며, 순서대로 데이터를 저장할 경우 사용한다.
 * List를 구현받은 class : ArrayList, LinkedList
 * 
 * Set interface
 * set은 중복을 허용하지않고, 순서가 없다. 즉, 순서없이 데이터만 존재한다.
 * 
 * Set을 구현받은 class : HashSet implements Set
 * 
 * Map interface
 * 파이썬의 dict과 동일하고, key-value 형태로 저장한다.
 * key는 중복이 불가능하다. 만약 중복 된 key가 들어온다면 value가 갱신된다.
 * put : key-value 로 데이터 저장
 * get : key를 이용하여 value를 추출
 * 
 * Map을 구현받은 class : HashMap implements Map
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		ArrayListTestClass.arrayListTest();	
		HashMapTestClass.hashMapTest();
		HashMapTestClass.hashMapStudent();
		HashSetTestClass.hashSetTest();
		HashLotto.hashSetLotto();
	}

}
