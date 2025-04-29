package com.edu.operator.test;

public class OperatorTest {
	int size; //Field 변수(메모리 저장영역은 Heap)
	
	public static void main(String[] args) {
		//Local 변수(메모리 저장영역은 Stack)
		int i = 6;
		int j = 3;
		i++;
		
		System.out.println("연산자 = : 값할당");
		System.out.println("연산자 % : 나머지 연산자"+i%j);//1
		System.out.println("연산자 / : 나누기"+i/j);//2
		
		/*
		  98
		  두자리수
		  십의자리 --> 9
		  일의자리 --> 8
		 */
		int num = 98;
		System.out.println("십의자리 : "+num/10);
		System.out.println("일의자리 : "+num%10);
		
		int k = 10;
		System.out.println(k++); //후위 연산자 
		System.out.println(k);
		int m = 9;
		System.out.println(--m); //전위 연산자
		System.out.println(m);
		
		////////////// same object? another object? ///////////////
		Operator1 o1 = new Operator1();
		Operator1 o2 = new Operator1();

		
		/*
		 	주소값이 같으면 Heap에 올라가 있는 같은 객체를 가리킨다.
		 	주소값이 다르면 Heap에 올라가 있는 서로다른 객체를 가리킨다.
		 */
		System.out.println("Reference Value o1=>"+o1);
		System.out.println("Reference Value o2=>"+o2);
		
		System.out.println("Same Object ==>"+(o1 == o2)); //false
		System.out.println("Anohter Object ==>"+(o1 != o2)); //true
		
		
		///////////////////// Short Circuit ///////////////////
		/*
		 	뒷 부분의 논리연산자를 진행시키지 않고 건너뛸 수 있다.
		 	뒷 부분 수행시 발생할 수 있는 예외상황을 건너뛸 수 있다.
		 */
		
		System.out.println(o1.test1() | o2.test2());// true | false = true
		System.out.println(o1.test1() & o2.test2());// true & false = false
		
		System.out.println("------------------------------------");
		System.out.println(o1.test1() || o2.test2());// true || false = true 앞에 값이 true면 or뒤를 실행하지 않는다. !!!
		System.out.println(o1.test2() && o2.test1());// true && false = false
		
		////////////////////////// ==, equals() ////////////////////////////////
		System.out.println(o1.equals(o2));//false ... 값 비교하는 함수
		System.out.println(o1==o2);//false ...  주소값 비교하는 연산자
		
		
		String test1="Hello";
		String test2=new String("Hello");
		String test3=new String("Hello");
		String test4="Hello";
		System.out.println("== : "+(test1==test2));//false test1과 test2는 Hello라는 값을 가지고 있지만 서로 다른 객체이므로 주소값이 달라서 false를 반환한다.
		System.out.println("equals() : "+test1.equals(test2));//true equals()함수는 객체의 주소값이 아닌 실제값을 비교하기때문에 true를 반환한다.
		System.out.println("확인용"+(test2==test3));//test2,test3는 New String()으로 객체를 생성해서 객체의 주소값이 다르기떄문에 false 반환한다.
		System.out.println("literal Pool 확인용"+(test1==test4));//test1,test4는 같은 단어이므로 literal pool을 가르키고있어서 true 반환한다.
		
		
		System.out.println("msg =="+(o1.msg == o2.msg));
		//스트링 데이터값을 비교할때는 반드시 equals()를 사용, ==연산자 사용하면 안됨!!
		System.out.println("msg equals()"+o1.msg.equals(o2.msg));
	}//main
}//class

class Operator1{
	String msg = "Hello";
	public boolean test1() {
		//System.out.println("test1() calling....");
		return true;
	}
	public boolean test2() {
		//System.out.println("test1() calling....");
		return false;
	}
}

class Operator2{
	public boolean test1() {
		System.out.println("test1() calling....");
		return true;
	}
	public boolean test2() {
		System.out.println("test1() calling....");
		return false;
	}
}

