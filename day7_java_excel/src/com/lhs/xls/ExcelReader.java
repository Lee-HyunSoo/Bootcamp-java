package com.lhs.xls;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReader {

	public ExcelReader() {
	}
	
	public static void excelReader() {
		String uri = "c:/filetest/data.xls";
		File f = new File(uri);
		
		Workbook wb = null;
		try {
			wb = Workbook.getWorkbook(f);
			Sheet s = wb.getSheet(0); // 0번 index의 시트를 가져옴
			int n = 0; 
			while(true) {
				try {
					Cell c = s.getCell(0, n); // 몇 행 몇 열?
					System.out.println(c.getContents());
					n++;					
				} catch (Exception e) {
					break;
				}
			}
			
			wb.close();
		} catch (BiffException e) { // 확장자 오류 : xls, xlsx 중 xlsx는 못읽어서 쓰는 exception
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
