package com.lhs;

public class CafeSalesClass {
	private String order_id = null;
	private String order_date = null;
	private String category = null;
	private String item = null;
	private int price = 0;
	
	public CafeSalesClass() {

	}
	
	public CafeSalesClass(String order_id, String order_date, String category, String item, int price) {
		this.setOrder_id(order_id);
		this.setOrder_date(order_date);
		this.setCategory(category);
		this.setItem(item);
		this.setPrice(price);
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
