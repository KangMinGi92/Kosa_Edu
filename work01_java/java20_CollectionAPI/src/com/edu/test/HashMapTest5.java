package com.edu.test;

import java.util.HashMap;
import java.util.Map;
//Set 중복을 허용하지 않기(Unique)때문에 보통 Map 의 key값을 담아내는 그릇으로 활용한다.
/*
 	put(key, value)
 	remove(key)
 	replace(key, value)
 	get(key)
 	keySet()
 	isEmpty()
 	size()
 	containsKey()
 	values()
 */
public class HashMapTest5 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("이수근", 90); // Integer i  = new Integer(90)
		map.put("서장훈", 93);
		map.put("강호동", 88);
		map.put("김영철", 98);
		map.put("김희철", 80);

		
		
		
		System.out.println("============== keySet() =============");
		//1.
		/*
		 	-아는 형님 멤버들의 이름들 추출해서
		 	-반복문을 통해서 키값에 해당하는 성적을 받아오고
		 	-최종적으로 모든 멤버의 성적과 멤버들의 평균을 구해서 출력
		 */
		
		System.out.println(map.keySet());
		int total=0;
		for(String name : map.keySet()) {
				int score=map.get(name);
				total += score;
		}
		System.out.println("멤버들의 성적의 총합은 "+total+" 점입니다.");
		System.out.println("멤버들의 성적의 평균은 "+total/map.size()+" 점입니다.");
		
		//2. 
		/*
		 	김희철을 삭제
		 	민경훈, 95 데이터 추가
		 */
		
		for(String name : map.keySet()) {
			if(name.equals("김희철"))
				map.remove(name);
		}
		map.put("민경훈", 95);
		
		System.out.println(map);
		
	}
}
