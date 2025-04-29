package com.edu.array.test2;
//배열은 초기 선언한 사이즈를 변경할 수 없다.
//배열의 사이즈를 변경하는 순간 새로운 배열이 생성
public class ArrayTest1 {

	public static void main(String[] args) {
		int[] members = {1,2,3,4,6,10};
		
		for(int member : members) System.out.print(member+" ");
		
		members = new int[9]; //칸이 3칸 더 늘어났다.
		
		members[6]=9;
		members[7]=23;
		members[8]=7;
		System.out.println("=========member추가한 후 결과========");
		for(int member : members) System.out.print(member+" ");		
		
	}

}
