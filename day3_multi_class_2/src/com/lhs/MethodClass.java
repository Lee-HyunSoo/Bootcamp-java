package com.lhs;

public class MethodClass {

	public MethodClass() {

	}
	
	public static double realPriceMethod(int price, int dc) {
		return price * (100 - dc) * 0.01;	
	}
}
