package com.edu.parent;

import java.time.LocalDate;

/*
 	Interface -> abstract method 로만 구성
 	
 	Abstract Class -> abstract 1개 이상 or 완전한 구현
 	
 	Super Class -> 필드 + 메소드
 	
 	Child Class -> Super + 자신의 멤버(필드,메소드)
 	
 	추상 클래스의 용도
 	1. 피자를 만들어 내기 위한 공통의 성질은 그대로 자식에게 물려주고
 	2. 반면에, 서로 다른 종류의 피자를 만들어내기 위한 결정적인 부분은 추상메소드로 물려준다.
 	 
 	 topping()에 따라서 서로다른 피자...?...abstract
*/
public abstract class Pizza {
	private int price;
	private String brand;
	public Pizza() {
		this(15000,"PizzHut");
	}
	
	public Pizza(int price, String brand) {
		super();//Object
		this.price = price;
		this.brand = brand;
	}
	
	//기능
	private void dogh() {
		System.out.println("피자 반죽과 함께 도우를 잘 만들어준다.");
	}
	
	private void bake() {
		System.out.println("180도 고온에서 15분간 굽는다.");
	}
	
	private void boxing() {
		System.out.println("종이박스에 잘 넣는다.");
	}
	
	private void cutting() {
		System.out.println("피자를 8조각으로 커팅한다.");
	}
	
	public abstract void topping(); // private으로 하지못하는 이유는 자식이 상속받아서 재정의해서 사용해야하는 추상메소드라서
	
	//위 기능들을 순서대로 호출하는 포괄적인 기능을 재정의
	
	public void sequencePizza() {
		dogh();
		topping();
		bake();
		cutting();
		boxing();
	}
	
	//정보를 리턴하는 기능 Overriding
	@Override
	public String toString() {
		return "상점이름, "+brand+" - 가격, " + price;
	}
}
