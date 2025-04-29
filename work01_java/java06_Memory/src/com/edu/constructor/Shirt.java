package com.edu.constructor;

public class Shirt {
	
	public String brand; //null
	public int size;//0
	public boolean longSleeved;//false
	
	public Shirt(){}//기본 생성자
	public Shirt(String brand, int size, boolean longSleeved) { //명시적 생성자
		this.brand = brand;
		this.size = size;
		this.longSleeved = longSleeved;
	}
	//**인자값이 있는 생성자를 만들면 기본 생성자를 필수로 만들어줘야한다.
	
	/*
	 	메소드 정의 = 메소드 선언부 + 메소드 구현부
	 		1) 메소드 선언부의 구성요소 : public return_type 함수이름(인자값){}
	 */
	
	//메소드 선언부 
	public void setShirt(String brand, int size, boolean longSleeved) {
		//{ }에 모든 범위가 메소드 구현부
		//필드초기화
		this.brand = brand;
		this.size = size;
		this.longSleeved = longSleeved;
				
	}
	
	public String getDetails() {
		return brand+"\t"+size+"\t"+longSleeved;
	}
}
