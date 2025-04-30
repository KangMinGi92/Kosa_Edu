package com.edu.exception.test;
/*
 									Throwble
 			Exception(Mild한 손상)					Error(Serious한 손상)
 	RuntimeException		CompileException
 	컴파일 o 실행시발생			컴파일시 발생
 	
 	
 */
/*	
 	RuntimeException
 	명시적으로 예외를 처리할 필요가 없다.
 	코드를 수정하면 된다.
 */
public class RuntimeExceptionTest1 {
	
	public static void main(String[] args) {
		String[ ] str = {
				"Hello",
				"No, I Mean it",
				"Nice to meet you"
		};
		
		int i=0;
//		while(i<=3) {
		while(i<3) {
			System.out.println(str[i]); // 메소드 안에서 줄단위로 예외가 발생한다!!!!
			i++;							// i가 0,1,2일때는 정상적으로 동작한다.
		}									// i가 3이 될때 폭탄이 터진다.
		System.out.println("The end....");	// 예외를 처리한다는것은 
											// 비정상종료 -> 정상종료
		
		/*
	 	예외를 명시적으로 처리하는 방법 1 
	 	try{
	 		예외발생 가능성있는코드
	 	}catch(생성한 예외 객체){
	 		예외잡았을경우 코드
	 	}
		 */
		System.out.println("===============================================");
		int j=0;
		while (j <= 3) {
			try {
				System.out.println(str[j]); //예외발생 안하면 실행
			} catch (ArrayIndexOutOfBoundsException e) { //예외발생 하면 실행
				System.out.println("Nice Catch~~!!");
			}
			j++;
		}
		System.out.println("The end...."); //try catch가 정상적으로 작동해서 정상종료
	}

}
