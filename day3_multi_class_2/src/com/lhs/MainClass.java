package com.lhs;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		DataClass dataClass = new DataClass();
		
		for (BookClass book : dataClass.books)
			PrintClass.prn(book.title, MethodClass.realPriceMethod(book.price, book.dc));
		
		Scanner scan = new Scanner(System.in);
		System.out.print("저자 입력: ");
		String author = scan.nextLine();
		PrintClass.prn(author, MethodClass.findBookTitles(author, dataClass.books));	
	}
}
