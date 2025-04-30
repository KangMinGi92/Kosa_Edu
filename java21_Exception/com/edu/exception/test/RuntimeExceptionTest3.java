package com.edu.exception.test;

public class RuntimeExceptionTest3 {
	
	public static void main(String[] args) {
		String[ ] str = {
				"Hello",
				"No, I Mean it",
				"Nice to meet you"
		};
		//catch는 여러번 작성할 수 있다.
		//여러개의 catch문 중에서 단 하나만 동작한다.
		int j=0;
		while (j <= 3) {
			try {
				System.out.println(str[j]); //예외발생 안하면 실행
			} catch (NullPointerException e) { //예외발생 하면 실행
				System.out.println("Nice Catch~~1!!");
			} catch (ArithmeticException e) {//예외발생 하면 실행
				System.out.println("Nice Catch~~2!!");
			} catch (Exception e){// Exception은 부모라서 모든 자식을 커버할 수 있다.
				System.out.println("Nice Catch~~3!!");
			}
			j++;
		}
		System.out.println("The end...."); //try catch가 정상적으로 작동해서 정상종료
	}

}
