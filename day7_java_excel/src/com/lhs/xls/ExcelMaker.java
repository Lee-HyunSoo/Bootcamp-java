package com.lhs.xls;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

/*
 * 엑셀 파일 생성 및 데이터 추가
 */
public class ExcelMaker {

	public ExcelMaker() {
	}
	
	public static void excelMaker() {
		String uri = "c:/filetest/data.xls";
		
		// 1. File 객체의 생성자를 이용하여 파일 경로를 전달
		File f = new File(uri); // File.class : java.io
		
		// 2. 쓰기 용도의 엑셀(WorkBook) 문서 객체 : jxl.jar
		WritableWorkbook wb = null;
		
		try {
			wb = Workbook.createWorkbook(f); // File 객체를 전달한 엑셀 문서
			WritableSheet s = wb.createSheet("첫 번째", 0); // (시트명, 시트의index)
			
			/* 
			 * 1. 텍스트 : Label.class -> new Lable(열, 행, 글씨);
			 * 2. sheet의 cell메서드 사용 -> s.addCell(Label)
			 */
			for (int i = 0; i < 10; i++) {
				Label label = new Label(0, i, "데이터" + i); // 데이터0
				s.addCell(label);
			}
			wb.write(); // 실제로 write 
			wb.close();	// 저장 및 종료
			System.out.println("엑셀 파일 생성 완료");
		} catch (IOException e) { // 외부파일
			System.out.println(e.getMessage());
		} catch (RowsExceededException e) { // 행에
			System.out.println(e.getMessage());
		} catch (WriteException e) { // 쓰기
			System.out.println(e.getMessage());
		}	
	}

}
