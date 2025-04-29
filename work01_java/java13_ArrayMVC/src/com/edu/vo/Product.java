package com.edu.vo;
/*
 	상품정보를 저장하는 클래스
 	private 필드로.... maker, price, quantity, company
 	주입의 통로 :: 명시적 생성자 | setXxx
 	반환 통로 :: getXxx
 */
public class Product {
	
	private String maker;
	private int price;
	private int quantity;
	private String company;
	public Product() {}
	
	public Product(String maker, int price, int quantity, String company) {
		this.maker = maker;
		this.price = price;
		this.quantity = quantity;
		this.company = company;
	}
	public String getMaker() {
		return maker;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getCompany() {
		return company;
	}
	public String getProductInfo() {
		return maker+","+price+","+quantity+","+company;
	}

}
