package com.lhs;

import java.util.ArrayList;

import java.util.Scanner;

/*
 * Java Collection Framework�� ���� : List, Map, Set
 * 1. List : index�� �����ϱ� ������ ������ �����Ѵ�.
 * 2. Map : index�� ���� ������ ������ ����. (key : value)
 * 3. Set : �����͸� �����Ѵ�.
 * 
 * ArrayList : java.util ��Ű�� �ȿ� ArrayList.class�� ����
 * ���� ��Ű���� ���� �ٸ� Ŭ������ ����� ���, import�� �̿��Ͽ� ������Ʈ ���η� �о�鿩���Ѵ�.
 * import : ctrl + shift + o -> import ������ package �Ʒ��� ��ġ�Ѵ�.
 * 
 * ArrayList �����
 * 1. ArrayList<������Ÿ��> ������ = new ArrayList<������Ÿ��>();
 * 2. ������ �߰� ��� : ������.add(������);
 * 3. ������ ���� ��� : ������.get(index);
 * 4. ������ ���� ��� : ������.remove(index); -> �ش� �����͸� ����鼭 ��ȯ
 * 5. ��� ������ ���� : ������.clear();
 * 6. ������ ���� Ȯ�� : ������.size(); -> java 1.8�������� size(), length() �Ѵ� ��� ����
 * 
 * ArrayList�� Ư�� ������Ÿ���� �������� ������ �߰��Ǵ� �����͵��� Object�� ���μ� �߰��Ѵ�.
 * ���� �پ��� ������Ÿ�Ե��� ������ ���� �ִ�.
 * ArrayList�� �ַ� ��ü�� ������ �� ����Ѵ�.
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
		
		al.set(1, b); // ���� : Ư�� ��ġ(index)�� �����͸� ���ο� �����ͷ� ����
		
		NewsClass c = al.get(3); // Ư�� index�� �����͸� ������

		al.clear();
		System.out.println(al.size());
		
		TestClass testClass = new TestClass();
		System.out.println(testClass.a); // default
		System.out.println(testClass.b); // public
		System.out.println(testClass.getName()); // private
		
		
		NewsDataClass newsDataClass = new NewsDataClass();
		
		// �ֿܼ��� �Է� �ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.print("�˻��� �Ź��� �Է�: ");
		String press = scan.next();
		NewsPrintClass.printURL(press, NewsMethodClass.searchNewsURL(newsDataClass.news, press));
		NewsPrintClass.printCategory(NewsMethodClass.removeDuplicateCategory(newsDataClass.news));
		
		scan.close();
	}
}
