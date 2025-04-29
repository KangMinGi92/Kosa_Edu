package com.edu.test;
//7. static한 변수는 생성된 객체들에서 공유한다.!!!!!!!!!
	//필드는 생성된 인스턴스마다 서로다른 값을 가지고
	//Class V(전역변수)는 생성된 각각의 객체들이 동일한 값을 공유한다.


/*
 			Field			static V			Local V
 	선언위치	클래스 아래		클래스 아래			메소드 블락 안
 			메소드 바깥		메소드 바깥
 
 	메모리	Heap			Class Area			Stack
 	
 	별칭		Member V		Class V				지역변수
 							전역변수				Automatically V
 												Temporary V
 												
 	기본값	있음				있음					없음(사용하기 전 반드시 초기화 하고 쓴다)
 */
class Car{
	int serialNumber; //field
	static int counter; // static V(class V,전역변수)
	
	//field는 생성된 객체 각각 마다 서로 다른 값을 가진다.
	//static 변수는 static메모리에 올라간 값을 각 객체에서 공유해서 사용해서 같은값을 가진다.
	public Car() {
		counter++;
		serialNumber = counter;
	}
	
}
public class StaticExamTest3 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		System.out.println("============== field =================");
		System.out.println(c1.serialNumber);//1
		System.out.println(c2.serialNumber);//2
		System.out.println(c3.serialNumber);//3
		System.out.println("============== static V=================");
		System.out.println(Car.counter);//3
		
		System.out.println(c1.counter);//3
		System.out.println(c2.counter);//3
		System.out.println(c3.counter);//3
		
	}

}
