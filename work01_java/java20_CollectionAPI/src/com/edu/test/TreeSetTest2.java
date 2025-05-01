package com.edu.test;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

/*
 			Collection
 				|
 			   Set
 			    |
 			   SortedSet
 			   		|
 			   	TreeSet(중복x, 순서x(index가 없다!!), 정렬o)
 */
public class TreeSetTest2 {

	public static void main(String[] args) {
//		Set<String> set = new TreeSet<>();
//		set.add("BBB");
//		set.add("FFF");
//		set.add("AAA");
//		set.add("BBB");
//		set.add("QQQ");
//		System.out.println(set); // index로 관리하지않아 순서는 없지만 알파벳순으로 정렬은 가능하다!!
		TreeSet set = new TreeSet();
		set.add(11); // set.add(new Integer(11));  --->java의 Auto Boxing때문에 자동으로 int타입을 객체인 Wrapper 클래스로 넣어준다.
		set.add(3);
		set.add(90);
		set.add(2);
		set.add(90);
		System.out.println(set.higher(3));//3보다 바로다음 큰수
		System.out.println(set.lower(3));//3보다 바로다음 작은수
		System.out.println(set.headSet(11));//해당숫자 포함하지않고 11보다 작은 수 전체
		System.err.println(set.tailSet(11));//해당숫자 포함하고 11보다 큰 수 전체
		
	}

}
