package com.edu.constructor;

public class NoteBook {
	long serialNumber;
	String maker;
	float price;
	
	public NoteBook(){}
	public NoteBook(long serialNumber,String maker,float price) {
		//필드초기화
		this.serialNumber=serialNumber;
		this.maker=maker;
		this.price=price;
	}
	public String getDetails() {
		return serialNumber+"\t"+maker+"\t"+price;
	}
	public void discountPrice(int discountValue) {
//		price=price-discountValue;
		price-=discountValue;
	}
}
