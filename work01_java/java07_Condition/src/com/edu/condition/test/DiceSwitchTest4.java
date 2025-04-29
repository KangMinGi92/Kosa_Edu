package com.edu.condition.test;

import java.util.Random;

/*
 	0~1사이의 랜덤한 실수형을 반환하는 기능.
 		Math.random();
 	
 	랜덤한 정수값을 반환받는 기능
 		0~n-1 사이의 임의의 정수를 반환
		Random random=new Random();
		int num=random.nextInt(3);
		System.out.println(num);
 */
public class DiceSwitchTest4 {
	public static void main(String[] args) {
		/*
		Random random=new Random();
		int num=random.nextInt(6)+1;//1~10사이의 랜덤
		*/
		int num=(int)(Math.random()*6)+1;//1~10사이의 랜덤
		switch(num) {
		case 1: System.out.println("Dice 1"); break;
		case 2: System.out.println("Dice 2"); break;
		case 3: System.out.println("Dice 3"); break;
		case 4: System.out.println("Dice 4"); break;
		case 5: System.out.println("Dice 5"); break;
		case 6: System.out.println("Dice 6"); break;
		}
	}
}
