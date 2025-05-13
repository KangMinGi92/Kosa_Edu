package step1;
/*
람다, 람다식(Lambda)
함수형 프로그램
자바 8버전에서 새롭게 추가된 기술
	1) 익명함수(함수명이 없다)
	2) 코드가 간결하고 성능상 좋다
	3) Collection(List, Map, Set)안에 데이터를 처리할때 유용하다 - Collection Stream
	4) 병렬처리 가능

람다식 --- 함수형 인터페이스(Functional Interface(추상메소드가 오직 1개만 존재!)에서 주로 사용됨
*/

//Annotation 을 붙이면 컴파일시에 추상메소드가 1개 인지를 확인
@FunctionalInterface
interface MyFunction{
	int max(int a, int b);// 2개의 숫자중 더 큰수를 반환하는 기능의 Template;
}
public class LambdaTest1 {
	public static void main(String[] args) {
		//1. 익명클래스로 구현.. 우리는 여태까지 이렇게 했다.
		MyFunction mf = new MyFunction() {
			
			@Override
			public int max(int a, int b) {
				return a>b?a:b;
			}
		};
		
		int result = mf.max(5, 3);
		System.out.println("Result1=>"+result);
		System.out.println("=================");
		
		//2. 람다식으로 구현
		MyFunction mf2 = (a,b)->a>b?a:b;
		int result2=mf2.max(5, 3);
		System.out.println("Result2=>"+result2);
		
	}//main
}//class
