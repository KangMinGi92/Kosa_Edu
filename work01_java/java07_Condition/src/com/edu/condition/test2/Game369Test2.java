package com.edu.condition.test2;

import java.util.Scanner;

public class Game369Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 2자리수만 입력 >>");
		int num = sc.nextInt();
		
		Game369 game = new Game369();
		String result=game.solv(num);
		
		System.out.println(result);

	}

}
class Game369{
	public String solv(int num) {
		//직접 구현해보세요
//		if(((num/10)/3)==1||(num/10)/3==2||(num/10)/3==3) {
//			if((num%10)/3==1||(num%10)/3==2||(num%10)/3==3)return"@@";
//			else return "@";
//		}else {
//			if((num%10)/3==1||(num%10)/3==2||(num%10)/3==3)return"@";
//			else return ""+num;
//		}
		int first = num/10; //십의 자리
		int second = num%10; //일의 자리
		if((first%3==0)&&((second%3==0)&&(second!=0)))return "@@";
		else if((first%3==0)||((second%3==0)&&(second!=0)))return"@";
		else return num+"";
	}
}