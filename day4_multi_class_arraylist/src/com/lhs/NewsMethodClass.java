package com.lhs;

import java.util.ArrayList;
import java.util.HashSet;

public class NewsMethodClass {

	public NewsMethodClass() {
	
	}
	
	public static ArrayList<String> searchNewsURL(ArrayList<NewsClass> news, String press) {
		ArrayList<String> urls = new ArrayList<String>();
		for (int i = 0; i < news.size(); i++) {
			if (news.get(i).press.contains(press))
				urls.add(news.get(i).url);
		}
		return urls;
	}
	
	// 1. list�� Ȱ���� �ߺ�����
	public static ArrayList<String> removeDuplicateCategory(ArrayList<NewsClass> news) {
		ArrayList<String> categories = new ArrayList<String>();
		for (NewsClass n : news) {
			if (!categories.contains(n.category))
				categories.add(n.category);
		}
		return categories;
	}
		
	// 2. hash�� Ȱ���� �ߺ�����
	public static ArrayList<String> removeDuplicateCategory2(ArrayList<NewsClass> news) {
		HashSet<String> hashSet = new HashSet<String>();
		for (NewsClass n : news)
			hashSet.add(n.category);
		return new ArrayList<String>(hashSet);
	}
}
