package com.lhs;

import java.util.ArrayList;

import java.util.Scanner;

/*
 * Java Collection Framework의 종류 : List, Map, Set
 * 1. List : index가 존재하기 때문에 순서가 존재한다.
 * 2. Map : index가 없기 때문에 순서가 없다. (key : value)
 * 3. Set : 데이터만 존재한다.
 * 
 * ArrayList : java.util 패키지 안에 ArrayList.class로 존재
 * 현재 패키지에 없는 다른 클래스를 사용할 경우, import를 이용하여 프로젝트 내부로 읽어들여야한다.
 * import : ctrl + shift + o -> import 구문은 package 아래에 위치한다.
 * 
 * ArrayList 사용방법
 * 1. ArrayList<데이터타입> 변수명 = new ArrayList<데이터타입>();
 * 2. 데이터 추가 방법 : 변수명.add(데이터);
 * 3. 데이터 추출 방법 : 변수명.get(index);
 * 4. 데이터 삭제 방법 : 변수명.remove(index); -> 해당 데이터를 지우면서 반환
 * 5. 모든 데이터 삭제 : 변수명.clear();
 * 6. 데이터 개수 확인 : 변수명.size(); -> java 1.8버전에선 size(), length() 둘다 사용 가능
 * 
 * ArrayList는 특정 데이터타입을 지정하지 않으면 추가되는 데이터들을 Object로 감싸서 추가한다.
 * 따라서 다양한 데이터타입들을 포함할 수도 있다.
 * ArrayList는 주로 객체를 저장할 때 사용한다.
 */

public class NewsMainClass {

	public static void main(String[] args) {
		ArrayList<NewsClass> al = new ArrayList<NewsClass>();
		
		NewsClass a = new NewsClass();
		al.add(a);
		al.add(a);	
		al.add(a);	
		al.add(a);	
		al.add(a);
		System.out.println(al.size());
		
		NewsClass b = al.remove(0);
		System.out.println(al.size());
		
		al.set(1, b); // 변경 : 특정 위치(index)의 데이터를 새로운 데이터로 변경
		
		NewsClass c = al.get(3); // 특정 index의 데이터를 가져옴

		al.clear();
		System.out.println(al.size());
		
		TestClass testClass = new TestClass();
		System.out.println(testClass.a); // default
		System.out.println(testClass.b); // public
		System.out.println(testClass.getName()); // private
		
		
		NewsDataClass newsDataClass = new NewsDataClass();
		
		// 콘솔에서 입력 받기
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 신문사 입력: ");
		String press = scan.next();
		NewsPrintClass.printURL(press, NewsMethodClass.searchNewsURL(newsDataClass.news, press));
		NewsPrintClass.printCategory(NewsMethodClass.removeDuplicateCategory(newsDataClass.news));
		
		scan.close();
	}
}
