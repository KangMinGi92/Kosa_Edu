package com.edu.exception.test;
/*
	예외를 처리하는 명시적인 방법1.
	try{
		예외 발생 가능성 있는 코드
	} catch(){
		예외 잡았을경우 코드
	}
	
	---------------------------------------------
	try{
		aaa
	}catch(예외객체 e){
		bbb
	}
		ccc
		
	1. 예외 발생 + 예외처리 안했다. -> 아무것도 실행 안됨
	2. 예외 발생 안했다. -> aaa, ccc 실행
	3. 예외 발생 + 예외처리 했다. -> bbb + ccc 실행
	4. 예외 발생 + 예외처리를 이상하게 했다. -> 아무것도 실행 안됨
 */
public class RuntimeExceptionTest2 {
	
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
			} catch (ArrayIndexOutOfBoundsException e){//예외발생 하면 실행
				System.out.println("Nice Catch~~3!!");
			}
			j++;
		}
		System.out.println("The end...."); //try catch가 정상적으로 작동해서 정상종료
	}

}
