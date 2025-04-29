package com.edu.capsulation;
// Encapsulation 캡슐화
/*
	class MyDate{
	
		int month;
		int day;
	}	
	class MyTest{
		public static void main(String[] args){
			MyDate md = new MyDate();
			//다른 클래스의 필드에 직접 접근... Invalid한 데이타 할당
			//field ---> private
			//setXxx(),getXxx() --->public
			md.month = 22;
			md.day = 33;
			
		}
	}
 */
public class MyDate {
	/* 날짜 관련된 정보를 저장하는 클래스
	 	제어문을 완성...
	 	월에 따라서 날짜가 달라진다.
	 	
	 	1.
	 	1,3,5,7,8,10,12월 ---> 1~31일
	 	2월 ---> 1~28일
	 	4,6,9,11월 --> 1~30일
	 	에 해당하는 값만 받아들이고 나머지는 에러메세지를 출력
	 	
	 	2.
	 	오늘은 x월 x일 입니다.--->o
	 	오늘은 0월 x일 입니다.--->x
	 	오늘은 x월 0일 입니다.--->x
	 */
	//해당 클래스의 멤버들끼리만 접근을 허용
	private int month;
	private int day;
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		//필드초기화 하기전에 제어한다.
			if(month>=1 && month<=12) {
				this.month = month;
			}else {
				System.out.println("잘못된 월 입력입니다.");
				//return;
				System.exit(0);
			}
	}
	public int getDay() {
		return day;
	}
	//month 필드에는 값이 1~12, 0
	public void setDay(int day) {
//		1,3,5,7,8,10,12월 ---> 1~31일
//	 	2월 ---> 1~28일
//	 	4,6,9,11월 --> 1~30일
		
		switch(month) {
			case 2: //2월달
				if(day>=1 && day<=28) {
					this.day=day;
				}else{
					System.out.println("Invalid Day~~!!");
					//return;
					System.exit(0);
				}
			break;
			case 4 : 
			case 6 :
			case 9 :
			case 11 :
				if(day>=1 && day<=30) {
					this.day=day;
				}else{
					System.out.println("Invalid Day~~!!");
//					return;
					System.exit(0);
				}
			break;
			default : //1,3,5,7,8,10,12
				if(day>=1 && day<=31) {
					this.day=day;
				}else{
					System.out.println("Invalid Day~~!!");
//					return;
					System.exit(0);
				}
			break;
		}
//		switch(month) {
//		case 1 : if(day>=1 && day<=31) this.day=day; else errorMessage();break;
//		case 2 : if(day>=1 && day<=28) this.day=day; else errorMessage();break;
//		case 3 : if(day>=1 && day<=31) this.day=day; else errorMessage();break;
//		case 4 : if(day>=1 && day<=30) this.day=day; else errorMessage();break;
//		case 5 : if(day>=1 && day<=31) this.day=day; else errorMessage();break;
//		case 6 : if(day>=1 && day<=31) this.day=day; else errorMessage();break;
//		case 7 : if(day>=1 && day<=31) this.day=day; else errorMessage();break;
//		case 8 : if(day>=1 && day<=31) this.day=day; else errorMessage();break;
//		case 9 : if(day>=1 && day<=31) this.day=day; else errorMessage();break;
//		case 10 : if(day>=1 && day<=31) this.day=day; else errorMessage();break;
//		case 11 : if(day>=1 && day<=31) this.day=day; else errorMessage();break;
//		case 12 : if(day>=1 && day<=31) this.day=day; else errorMessage();break;
//		default : 
//		}

	}
	
//	public void errorMessage() {
//		System.out.println("잘못된 값 입력입니다.");
//	}
//	
	
}
