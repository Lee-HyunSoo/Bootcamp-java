package com.naver.news;

/*
 * Controller, 전체적인 컨트롤
 */
public class NaverMainClass {

	public static void main(String[] args) {
		String uri = "C:\\filetest\\naver_news_stand_data_edit.txt";
		NaverDataClass naver = new NaverDataClass(uri);
		System.out.println(naver.news.size());
		for(NaverNewsClass tmp : naver.news)
			System.out.println(tmp.image + " " + tmp.uri);
		
		
		String tags = NaverMethodClass.createHTML(naver.news);
		System.out.println(tags);
		
		String uri2 = "C:\\filetest\\naver_news_stand.html";
		NaverPrintClass.saveHTML(uri2, tags);
	}
}
