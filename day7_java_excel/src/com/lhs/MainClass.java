package com.lhs;

import com.lhs.xls.ExcelMaker;
import com.lhs.xls.ExcelReader;

/*
 * 외부 라이브러리 가져오기
 * 1. 클래스파일 -> Build path -> Configure Build path -> Libraries -> add external jars
 * 2. module-info : requires 외부라이브러리명
 */
public class MainClass {

	public static void main(String[] args) {
		ExcelMaker.excelMaker();
		ExcelReader.excelReader();
	}

}
