package com.edu.constructor;
/*
 	Memory Allocation
 	JVM에 Heap영역과 Stack영역이있다.
 	1.stack영역에 공간이 먼저 할당된다.
 	2.heap영역에 묵시적 초기화(변수들의 기본값이 할당됨)
 	3.heap영역에 주소값이 할당됨
 	4.stack영역에 공간에 heap영역의 주소값이 할당됨.
 	5.stack영역의 주소값이 heap영역을 참조함
 	6.명시적 초기화/생성자 구동에 의한 초기화
 	
 	생성자 Constructor
 	객체가 생성될 때마다 호출되는 것
 	1.하나의 클래스에는 반드시 하나 이상의 생성자가 존재한다.
 	2.개발자가 명싲거 생성자를 넣어주면 그때는 기본생성자가 자동으로 들어가지 않는다.
 	(* 필요하면 이때는 직접 기본생성자를 정의해야한다.)
 	3.명시적 생성자가 하는 일은 "필드초기화"이다.
 	4.기본 생성자는 아무일도 하지 않는다. 단지 타입만 맞춰줄 뿐이다.
 	5.명시적 생성자는 setXxx()메소드와 동일한 작업을 하지만 메소드는 아니다.
 	(* 선언부에 return type이 없기 떄문에 메소드가 아니다. 
 	클래스의 구성요소 즉, 멤버가 아니기 때문에 메모리에 올라가는 대상이 아니다.)
 	6. 생성자 앞의 Access Modifier는 class를 따라간다.
 	
 	Shirt s1=new Shirt(); 기본생성자
 	Shirt s2=new Shirt("나이키",100,true); 명시적생성자
 	* 명시적 생성자는 필드를 초기화를 해준다.
 	
 	필드에 값이 주입되는 통로는 2가지가 있다.
 	1.명시적 생성자
 	2.setXxxx()
 */
//다양한 소매길이를 나타낼수 있는 셔츠타입의 클래스를 정의
public class Shirt {
	//필드는 선언만 하더라도 무조건 기본값을 가지고 있다.
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
