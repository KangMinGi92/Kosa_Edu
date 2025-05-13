package step1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Comparator사용시 람다형식을 적용
public class LambdaTest3 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(100,45,22,200,4,1,23,45,66);
		System.out.println("==============sort 하기 전===========");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("==============sort 한 후 ============");
		System.out.println(list);
		
		System.out.println("==============sort 한 후 내림차순 정렬============");
//		Collections.sort(list,new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2-o1;
//			}
//			
//		});
		Collections.sort(list,(o1,o2)->o2-o1);
		System.out.println(list);
		list.sort((o1, o2) -> o2-o1);
	}//main
}//class
