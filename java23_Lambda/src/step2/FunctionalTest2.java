package step2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
 	함수의 인자값으로 Functional Interface가 사용되는 핵심 예제
 */
public class FunctionalTest2 {

	public static void main(String[] args) {
		System.out.println("--------------1. Runnable void run() --------------");
		Runnable r = () -> System.out.println("run...함수");
		r.run();

		System.out.println("-------------2. Supplier R get() ------------------");
		Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;
		List<Integer> list = new ArrayList<>();
		makeRandomList(list, s);//call
		
		System.out.println(list);
		
		System.out.println("-------------3. Consumer void accept(T) ------------------");
		Consumer<Integer> c = (t) -> System.out.print(t + " ");

		System.out.println("-------------4. Function R apply(T) ------------------");
		Function<Integer, Integer> f = (i) -> i / 10 * 10; //일의자리를 없애는 로직
		List<Integer> returnList=doSomething(list, f);
		System.out.println(returnList);
		
		System.out.println("-------------5. Predicate boolean test(T) ------------------");
		Predicate<Integer> p = (i) -> i % 2 == 0; //test함수의 구현체...
		printEvenNumber(list,p,c);
		
		
		
		
	}//main
	
	private static void printEvenNumber(List<Integer> list, Predicate<Integer> p, Consumer<Integer> c) {
		//list 안에 있는 값들중 짝수를 찾아서 짝수값은 출력
		System.out.print("[");
		for(int i : list) { 
			if(p.test(i)) {
				c.accept(i);
			}
		}
		System.out.print("]");
	}

	private static void makeRandomList(List<Integer> list,Supplier<Integer> s) {
	//10회를 반복...Supplier로 부터 임의의 값을 받고.. 그 값을 list에 저장
		for(int i=0;i<10;i++) {
			list.add(s.get());
		}
	}
	private static List<Integer> doSomething(List<Integer> list, Function<Integer,Integer> func){
		List<Integer> newList = new ArrayList<>(list.size());
		//list안에 있는 값들을 하나씩 돌면서 일의자리를 없애고
		// 그 값들을 다시 newList에 담아서 반환
		for(Integer i : list) {
			newList.add(func.apply(i));
		}
		return newList;
	}
}//class
