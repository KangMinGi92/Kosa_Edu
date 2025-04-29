package com.edu.loop.test;
/*
 	반복문 Looping
 	1.for
	 	for(초기식;조건식;증감식;){
	 		//코드
	 	}
	 	for(int i=0; i<10; i++){//}
	 	
 	2.while
 	
 	초기식;
	 	while(조건식){
	 		//코드
	 		증감식;
	 	}
	 	int i=0;
	 	while(i<10){
	 		//
	 		i++;
	 	}
 	3.do~while
 */
public class BasicLoopTest1 {

	public static void main(String[] args) {
		System.out.println("=========for==========\n");
		for(int i=0; i<10; i++) 
			System.out.println("Hello for Looping..."+i);

		System.out.println("=========while==========\n");
		int i=10;
		while(i>0) {
			System.out.println("Hello for Looping..."+i);
			i--;
		}
		System.out.println("========= do while==========\n");
		int j=10;
		do {
			System.out.println("Hello for Looping..."+j);
			j--;
		}while(j>0);
	}

}
