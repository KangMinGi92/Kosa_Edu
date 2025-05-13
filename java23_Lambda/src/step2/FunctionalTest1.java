package step2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
 	함수형 인터페이스 구성요소
 	1) 추상메소드 --> 이게 핵심
 	2) default 메소드
 	3) static 메소드
 	:::
 	대표적인 Functional 인터페이스
 	매개변수 X, 반환타입 X ------------> Runnable	void run()
 	매개변수 O, 반환타입 X ------------> Consumer	void accept(T)
 	매개변수 X, 반환타입 O ------------> Supplier	R get()	
 	매개변수 O, 반환타입 O ------------> Function	R apply(T)
 	매개변수 O, 반환타입 O(boolean) ---> Predicate	boolean test(T)
 	
 */
public class FunctionalTest1 {

	public static void main(String[] args) {
		System.out.println("--------------1. Runnable void run() --------------");
//		Runnable r = new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("run...함수");
//			}
//		};
//		r.run();
		Runnable r = () -> System.out.println("run...함수");
		r.run();

		System.out.println("-------------2. Supplier R get() ------------------");
		// 1. 익명 클래스... 1~100사이의 난수를 반환
//		Supplier<Integer> s = new Supplier<Integer>() {
//
//			@Override
//			public Integer get() {
//				int result = (int)((Math.random()*100)+1);
//				return result;
//			}
//		};
//		System.out.println("Result="+s.get());

		Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;

		System.out.println("Result=" + s.get());

		System.out.println("-------------3. Consumer void accept(T) ------------------");
		// 1. 익명클래스...숫자를 입력받아서 그걸 출력
		Consumer<Integer> c = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t + " ");
			}
		};
		c.accept(100);
		// 2. 람다
		Consumer<Integer> c1 = (t) -> System.out.println(t+" ");
		c1.accept(100);
		
		System.out.println("-------------4. Function R apply(T) ------------------");
		//1.익명 클래스...특정한 숫자를 입력받고...이 숫자를 10으로 나눈 후 10을 다시 곱한다
		Function<Integer,Integer> f = new Function<Integer, Integer>(){
			
			@Override
			public Integer apply(Integer t) {
				return t/10*10;
				};
			};
			System.out.println(f.apply(20));
		//2.람다식
			Function<Integer,Integer> f1 =(i)->i/10*10;
			System.out.println(f1.apply(20));
		
			
		System.out.println("-------------5. Predicate boolean test(T) ------------------");
		Predicate<Integer> p = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t%2==0; //짝수 여부를 리턴
			}
		};
		System.out.println("짝수입니까?"+p.test(230));
		
		//2. 람다식
		Predicate<Integer> p1 = (i)-> i%2==0;
		System.out.println("짝수입니까?"+p1.test(169));
	}
		

}
