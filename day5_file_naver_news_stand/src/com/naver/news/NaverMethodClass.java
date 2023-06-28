package com.naver.news;

import java.util.ArrayList;

/*
 * HTML 태그 생성
 */
public class NaverMethodClass {

	public NaverMethodClass() {
	}
	
	public static String createHTML(ArrayList<NaverNewsClass> news) {
		String tags = "";
		
		tags += "<html>";
		tags += "<head><title>네이버 뉴스</title></head>";
		tags += "<body>";
		tags += "<table>";
		
//		tags += "<tr>";
//		for (int i = 0; i < news.size(); i++) {
//			if (i % 18 == 0)
//				tags += "</tr><tr>";
//			tags += "<td>";
//			tags += "<a href='" + news.get(i).uri + "'>";
//			tags += "<img src='C:\\filetest\\newsImages\\" + news.get(i).image + "' />";
//			tags += "</a>";
//			tags += "</td>";
//		}
//		tags += "</tr>";
//		
		int index = 0;
		for (int i = 0; i < 10; i++) {
			tags += "<tr>";
			for (int j = 0; j < 18; j++) {
				if (index == news.size())
					break;
				tags += "<td>";
				tags += "<a href='" + news.get(index).uri + "'>";
				tags += "<img src='C:\\filetest\\newsImages\\" + news.get(index).image + "' />";
				tags += "</a>";
				tags += "</td>";
				index++;
			}
			tags += "</tr>";
		}
		
//		tags += "<tr>";
//		for (NaverNewsClass naverNewsClass : news) {
//			tags += "<td>";
//			tags += "<a href='" + naverNewsClass.uri + "'>";
//			tags += "<img src='C:\\filetest\\newsImages\\" + naverNewsClass.image + "' />";
//			tags += "</a>";
//			tags += "</td>";
//		}
//		tags += "</tr>";
		tags += "</table>";
		tags += "</body>";
		tags += "</html>";
		
		return tags;
	}
}
