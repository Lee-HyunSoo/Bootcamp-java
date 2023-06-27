package com.lhs;

public class CafeSalesMainClass {

	public static void main(String[] args) {
		CafeSalesDataClass cafeSalesData = new CafeSalesDataClass();
		CafeSalesPrintClass.prnTodaySales(CafeSalesMethodClass.todaySales(cafeSalesData.cafeSales));
		CafeSalesPrintClass.prnBestSales(CafeSalesMethodClass.bestSales(cafeSalesData.cafeSales));
		CafeSalesPrintClass.prnBestSales(CafeSalesMethodClass.bestSales2(cafeSalesData.cafeSales));
	}
}
