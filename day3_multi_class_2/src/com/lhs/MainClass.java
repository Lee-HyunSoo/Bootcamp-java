package com.lhs;

public class MainClass {

	public static void main(String[] args) {
		DataClass dataClass = new DataClass();
		
		for (BookClass book : dataClass.books)
			PrintClass.prn(book.title, MethodClass.realPriceMethod(book.price, book.dc));
	}
}
